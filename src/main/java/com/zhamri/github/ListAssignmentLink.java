package com.zhamri.github;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ListAssignmentLink {

    private final String githubLink = "https://github.com/STIW3054-A182/Assignments/issues/3";
    private final String myString = "STIW3054-A182-A2";
    private Document doc;
    private RegexMatches regexMatches;
    private int total;


    public static void main(String[] args) {
        new ListAssignmentLink().Main();
    }

    public void Main() {

        regexMatches = new RegexMatches();

        try {

            doc = Jsoup.connect(githubLink).get();

            // get page title
            String title = doc.title();
            System.out.println("Title : " + title);

            // get all links for Assignment-2
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                String theLink = link.attr("href");
                if (regexMatches.isMatch(myString, theLink) == true) {
                    System.out.println(theLink);
                    total++;
                }
            }
            System.out.println("Total Assignment = " + total);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
