package edu.moisei.demo.controller.rest;

import edu.moisei.demo.ReaderHTML;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * index.html.CommonController
 *
 * @Autor: vovamv
 * @DateTime: 11.02.2021|11:37
 * @Version CommonController: 1.0
 */
@RestController(value = "/")
public class CommonController {
    @GetMapping(value = "/input")
    public String showMainPage() throws IOException {
        return "<!DOCTYPE html>\n" +
               "<html lang=\"en\">\n" +
               "<head>\n" +
               "    <meta charset=\"UTF-8\">\n" +
               "    <title>Laba 1</title>\n" +
               "</head>\n" +
               "<body>\n" +
               "    <h1 align=\"center\">Laba 1</h1>\n" +
               "    <br>\n" +
               "    <form action=\"title\" method=\"post\">\n" +
               "        <input type=\"text\" name=\"name\" placeholder=\"Enter name\">\n" +
               "        <input type=\"text\" name=\"theme\" placeholder=\"Enter theme\">\n" +
               "        <input type=\"submit\" value=\"Submit\">\n" +
               "    </form>\n" +
               "</body>\n" +
               "</html>";
    }

    @RequestMapping(value = "/title")
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        String theme = request.getParameter("theme");
        try (PrintWriter out = response.getWriter()) {
            out.println( "<!DOCTYPE html>\n" +
                    "<html lang='en'>\n" +
                    "<head>\n" +
                    "    <meta charset='UTF-8'>\n" +
                    "    <title>Title</title>\n" +
                    "    <style>\n" +
                    "        .description{\n" +
                    "            font-size: 13px;\n" +
                    "        }\n" +
                    "        .name{\n" +
                    "            margin-top: -15px;\n" +
                    "        }\n" +
                    "        .student{\n" +
                    "            margin-left: 660px;\n" +
                    "        }\n" +
                    "    </style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<p align='center'>\n" +
                    "    ???????????????????????? ???????????? ?????????????? <br>\n" +
                    "    ???????????????????????? ???????????????????????? ?????????????????????? ?????????? ???????? ????????????????????\n" +
                    "</p>\n" +
                    "<p align='center'>\n" +
                    "    ____<u>?????????????????????? ???????????????????????? ????????????????????????? ????????</u>____ <br>\n" +
                    "    <span class='description'>(?????????? ?????????? ??????????????, ???????????????? ??????????????)</span>\n" +
                    "</p> <br><br>\n" +
                    "<h1 align='center'>???????????????? ????????????</h1>\n" +
                    "<p align='center'>\n" +
                    "    ?? __<u>?????????????????-?????????????????????????? ??????????????????????????</u>__ <br>\n" +
                    "    <span class='description'>(?????????? ????????????????????)</span>\n" +
                    "</p>\n" +
                    "<p align='center'>???? ????????:</p>\n" +
                    "<h3 align='center' class='name'>" + theme + "</h3>\n" +
                    "<br>\n" +
                    "<div class='student'>\n" +
                    "    <p>\n" +
                    "        ??????????????: ?????????????? (????)__<u>1</u>__ ??????????,<br>\n" +
                    "        ??????????__<u>143</u>__ <br>\n" +
                    "        ??????????????????????????___<u>121</u>______________________ <br>\n" +
                    "        <span class='description' style='margin-left: 150px'>(???????? ??????????????????????????)</span><br>\n" +
                    "        ____<u>???????????????????? ?????????????????????? ????????????????????????</u>____ <br>\n" +
                    "        <span class='description' style='margin-left: 120px'>(?????????? ??????????????????????????)</span><br>\n" +
                    "        __________   <span style='margin-left: 40px'>_____<u>" + name + "</u>____</span><br>\n" +
                    "        <span class='description' style='margin-left: 10px'>(????????????)</span>\n" +
                    "        <span class='description' style='margin-left: 120px'>(????????????????, ????????????????)</span><br>\n" +
                    "    </p>\n" +
                    "    <p>\n" +
                    "        ???????????????? <span style='margin-left: 60px'>_______<u>?????????????? ??.??.</u>_______</span><br>\n" +
                    "        <span class='description' style='margin-left: 120px'>(????????????????, ????????????????)</span><br>\n" +
                    "        ???????????????????????????? <span style='margin-left: 5px'>______<u>???????????????????? ??.??.</u>_____</span><br>\n" +
                    "        <span class='description' style='margin-left: 120px'>(????????????????, ????????????????)</span><br>\n" +
                    "    </p>\n" +
                    "</div>\n" +
                    "<div style='margin-left: 380px'>\n" +
                    "    <p>\n" +
                    "        <strong>???? ?????????????? ????????????????: </strong><br>\n" +
                    "        ?????? ??_____??______________ 20____??.<br>\n" +
                    "        ???????????????? <span style='margin-left: 50px'>_________________</span><br>\n" +
                    "        <span class='description' style='margin-left: 160px'>(????????????)</span><br>\n" +
                    "        ???????????????????????????? <span style='margin-left: 5px'>_________________</span><br>\n" +
                    "        <span class='description' style='margin-left: 160px'>(????????????)</span><br>\n" +
                    "    </p>\n" +
                    "</div>\n" +
                    "<div style='margin-left: 720px; margin-top: -124px' >\n" +
                    "    <p>\n" +
                    "        <strong>???????? ??????????????</strong>??______??_____________ 20____??.<br>\n" +
                    "        <strong>????????????:</strong><br>\n" +
                    "        ???? ???????????????????????? ????????????___________________ <br>\n" +
                    "        <span class='description' style='margin-left: 220px'>(c????????????)</span><br>\n" +
                    "        ?????????????????? ?????????? <span style='margin-left: 66px'>   ___________________</span><br>\n" +
                    "        <span class='description' style='margin-left: 225px'>(??????????)</span><br>\n" +
                    "        ???? ???????????? ECTS <span style='margin-left: 53px'>   ___________________</span><br>\n" +
                    "        <span class='description' style='margin-left: 225px'>(????????????)</span><br>\n" +
                    "    </p>\n" +
                    "</div>\n" +
                    "<br>\n" +
                    "<p align='center'>????????????????, 20_<u>20</u>_</p>\n" +
                    "</body>\n" +
                    "</html>");
        }
    }

}
