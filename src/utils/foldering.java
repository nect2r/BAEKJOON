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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class foldering {

    public static void main(String[] args) {
        List<Map<String,String>> stepList = getStepList(URL, TABLE_SELECTOR, TD_SELECTOR);

        int count = 1;

        for(Map<String,String> map : stepList) {
            System.out.println(count + " : " + map.get("href") + " : " + map.get("text"));
            count++;
        }
    }

    //단계확인경로
    static final String URL = "https://www.acmicpc.net/step";

    //단계확인 css selector
    static final String TABLE_SELECTOR = ".table.table-bordered.table-striped tbody tr";

    //단계 href , text css selector
    static final String TD_SELECTOR = "td:nth-child(2) a";

    /**
     * URL 경로의 단계와 경로를 구해온다.
     * 
     * @param url 파싱할 경로(백준)
     * @param tableSelector 파싱할 table css selector
     * @param tdSelector 파싱할 table 내 td css selector
     * @return map 안에 href , text 존재
     */
    public static List<Map<String,String>> getStepList(String url, String tableSelector, String tdSelector) {
        List<Map<String,String>> stepList = new ArrayList<>();

        try{
            Document doc = Jsoup.connect(url).get();

            Elements tr = doc.select(tableSelector);

            for(Element element : tr) {
                String href = element.select(tdSelector).attr("href");
                String text = element.select(tdSelector).text();

                Map<String,String> map = new HashMap<>();
                map.put("href", href);
                map.put("text", text);

                stepList.add(map);
            }
        }catch(Exception e) {
           e.printStackTrace();
        }

        return stepList;
    }
}