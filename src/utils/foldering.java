/*
 * 백준 단계별로 풀어보기에 맞춰 패키지별로 파일을 구분하고있는데 너무 귀찮아서 제작
 * 
 * etc
 * https://www.acmicpc.net/step 에서 보여주는 단계와 https://www.acmicpc.net/step/? 에서 보여지는 ?인자 url이 다름
 * 보여주는 단계를 기준으로 정리하도록 진행
 * 
 * 종속성
 * jsoup.*.jar https://jsoup.org/download
 */
package utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class foldering {

    public static void main(String[] args) {
        List<String> hrefList = getStepList(STEP_URL, STEP_TABLE_SELECTOR, STEP_TD_SELECTOR);

        none(hrefList, PROBLEM_URL, PROBLEM_TABLE_SELECTOR, PROBLEM_TD_SELECTOR);
    }

    //문제확인 기본경로
    static final String PROBLEM_URL = "https://www.acmicpc.net";

    //문제확인 css selector
    static final String PROBLEM_TABLE_SELECTOR = "#problemset tbody tr";

    //문제확인 href css selector
    static final String PROBLEM_TD_SELECTOR = "td:nth-child(2) a";

    public static void none(List<String> hrefList, String problemUrl, String problemTableSelector, String problemTdSelector) {
        List<String> problemList = new ArrayList<>();

        File file = new File("temp");
        String projectPath = file.getAbsoluteFile().toString();
        String srcPath = projectPath.substring(0, projectPath.indexOf(File.separator + "temp")) + File.separator + "src";

        Path stepPath = Paths.get(srcPath + File.separator + "step_" + (i + 1));

        //step_* 디렉토리 존재여부
        //존재하면 안에 problem_*.java 조회하여 step과 일치하는곳으로 이동
        if (Files.isDirectory(stepPath)) {
            Path problemPath = Paths.get(srcPath);

            List<Path> result;
            Stream<Path> walk = Files.walk(problemPath);
            result = walk.filter(Files::isRegularFile).collect(Collectors.toList());

            for(Path path : result) {
                System.out.println(path);
            }

            break;
        } else if (Files.isRegularFile(stepPath)) {
            System.out.println("파일이 존재합니다");
        }

        for(int i = 0; i < hrefList.size(); i++) {
            String href = hrefList.get(i);

            try {
                Document doc = Jsoup.connect(problemUrl + href).get();

                Elements tr = doc.select(problemTableSelector);

                for(Element element : tr) {
                    String problemHref = element.select(problemTdSelector).attr("href");
                    problemList.add(problemHref);
                }

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    //단계확인경로
    static final String STEP_URL = "https://www.acmicpc.net/step";

    //단계확인 css selector
    static final String STEP_TABLE_SELECTOR = ".table.table-bordered.table-striped tbody tr";

    //단계 href css selector
    static final String STEP_TD_SELECTOR = "td:nth-child(2) a";

    /**
     * URL 경로의 단계와 경로를 구해온다.
     * 
     * @param url 파싱할 경로(백준)
     * @param tableSelector 파싱할 table css selector
     * @param tdSelector 파싱할 table 내 td css selector
     * @return map 안에 href , text 존재
     */
    public static List<String> getStepList(String url, String tableSelector, String tdSelector) {
        List<String> stepList = new ArrayList<>();

        try{
            Document doc = Jsoup.connect(url).get();

            Elements tr = doc.select(tableSelector);

            for(Element element : tr) {
                String href = element.select(tdSelector).attr("href");
                stepList.add(href);
            }
        } catch(Exception e) {
           e.printStackTrace();
        }

        return stepList;
    }
}