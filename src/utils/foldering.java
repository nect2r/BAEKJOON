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

        none(hrefList, PROBLEM_URL, PROBLEM_TABLE_SELECTOR);
    }

    //문제확인 기본경로
    static final String PROBLEM_URL = "https://www.acmicpc.net";

    //문제확인 css selector
    static final String PROBLEM_TABLE_SELECTOR = "#problemset tbody tr td.list_problem_id";

    public static void none(List<String> hrefList, String problemUrl, String problemTableSelector) {
        List<String> problemList = new ArrayList<>();

        File file = new File("temp");
        String projectPath = file.getAbsoluteFile().toString();
        String srcPath = projectPath.substring(0, projectPath.indexOf(File.separator + "temp")) + File.separator + "src";

        try {
            Path problemPath = Paths.get(srcPath);
    
            List<Path> result;
            Stream<Path> walk = Files.walk(problemPath);
            result = walk.filter(Files::isRegularFile).collect(Collectors.toList());
    
            for(Path path : result) {
                problemList.add(path.toString());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        for(int i = 0; i < hrefList.size(); i++) {
            String href = hrefList.get(i);
            Path stepPath = Paths.get(srcPath + File.separator + "step_" + (i + 1));
            File stepFolder = new File(stepPath.toString());

            try {
                Document doc = Jsoup.connect(problemUrl + href).get();

                Elements tr = doc.select(problemTableSelector);

                for(Element element : tr) {
                    String problem = element.text();

                    for(String javaPath : problemList) {
                        if(javaPath.contains("problem_" + problem)) {
                            if(!javaPath.contains("step_" + (i + 1) + File.separator + "problem_" + problem)) {
                                if(!stepFolder.isDirectory()) {
                                    stepFolder.mkdir();
                                }
                                    
                                Path oldfile = Paths.get(javaPath);
                                Path newfile = Paths.get(stepPath.toString() + File.separator + "problem_" + problem + ".java");
                                Files.move(oldfile, newfile);
                            }
                        }
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
                break;
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