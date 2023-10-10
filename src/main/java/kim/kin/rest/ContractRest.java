package kim.kin.rest;

import kim.kin.config.security.AnonymousKimAccess;
import kim.kin.utils.PdfUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author choky
 */
@Controller
public class ContractRest {

    @Value("${fonts.font-family}")
    private String fontFamily;

    private PdfUtils pdfUtils;

    @Autowired
    public void setPdfUtils(PdfUtils pdfUtils) {
        this.pdfUtils = pdfUtils;
    }

    /**
     * 查看模板
     * <a href="http://localhost:1987/kim-api/contract/12405">...</a>
     *
     * @param id    模板编号
     * @param model model
     * @return 模板
     */
    @GetMapping("/contract/{id}")
    @AnonymousKimAccess
    public String contract(@PathVariable String id, Model model) {
        record Loan1(String downDate, String perMonthDate, String periods, String loanAmt, String borrowReason,
                     String xtSn, String repaymentAccount, String channel, String repaymentName, String applySn,
                     String fundsSn) {
        }
        record MemberClientele(String creSn, String censusAddrDetail, String bodies, String creValid,
                               String companyName, String companyAddrDetail, String liveAddrDetail) {

        }
        record Member(String applyTime, String qq, String nationality, String birthday, String mobile, String email,
                      String gender,
                      String creSn, String realName, Loan1 loan, Map<String, String> paramMap,
                      MemberClientele memberClientele) {
        }
        record RepaymentDates(String period, String repaymenDate, String planPrincipal, String planServiceFee,
                              String repaymenMoney) {
        }
        record FundsSource1(String companyName, String companyLogo) {

        }
        record ContactothersHb(String parentsName, String family1Name, String contactName, String parentsTel,
                               String family1Tel, String contactTel, String parentsRel, String family1Relation,
                               String contactRel) {
        }
        String currentDate = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);
        HashMap<String, String> paramMap = new HashMap<>();
        paramMap.put("repaymentBank", "工商银行");
        paramMap.put("gender", "女");
        paramMap.put("companyProvince", "重庆市");
        paramMap.put("censusProvince", "重庆市");
        paramMap.put("liveProvince", "重庆市");
        paramMap.put("companyCity", "重庆");
        paramMap.put("censusCity", "重庆");
        paramMap.put("liveCity", "重庆");
        paramMap.put("companyDistrict", "渝北");
        paramMap.put("censusDistrict", "渝北");
        paramMap.put("liveDistrict", "渝北");
        paramMap.put("companyAddrDetail", "**路**街道**号");
        paramMap.put("censusAddrDetail", "**路**街道**号");
        paramMap.put("liveAddrDetail", "**路**街道**号");
        String channel = "08";

        RepaymentDates repaymentDate1 = new RepaymentDates("1", "20230101", "5000", "100", "550.00");
        RepaymentDates repaymentDate2 = new RepaymentDates("2", "20230201", "5000", "100", "551.00");
        RepaymentDates repaymentDate3 = new RepaymentDates("3", "20230301", "5000", "100", "552.00");
        List<RepaymentDates> repaymentDates = Arrays.asList(repaymentDate1, repaymentDate2, repaymentDate3);

        Loan1 loan = new Loan1("20230101", "1日", "18", "5000", "购买XXXX", "HT22256465********", "6226***********", channel, "麻子", "APPLYSNXXX***", "131");
        MemberClientele memberClientele = new MemberClientele("XXXXCRESN", "金山商业中心", "渝北", "20550101", "**公司", "**路**街道**号", "**路**街道**号");
        Member member = new Member(currentDate, "QQ*****", "汉", "20230101", "18555555555", "@5dhj.com", "1", "3333333CRESN", "麻子", loan, paramMap, memberClientele);
        FundsSource1 fundsSource = new FundsSource1("hoben-api", "https://hw.5dhj.com/huij-fs/file/common/app/images/logo_10_tz.png");
        ContactothersHb contactothersHb = new ContactothersHb("麻大", "麻三", "麻烦", "185*******", "185*******", "185*******", "父子", "母子", "朋友 ");
        model.addAttribute("member", member);
        model.addAttribute("repaymentDates", repaymentDates);
        model.addAttribute("loan.monthRate", "0.15%");
        model.addAttribute("fundsSource", fundsSource);

        model.addAttribute("contractDate", currentDate);
        model.addAttribute("contractYear", currentDate.substring(0, 4));
        model.addAttribute("contractMonth", currentDate.substring(4, 6));
        model.addAttribute("contractDay", currentDate.substring(6, 8));
        model.addAttribute("contactothersHb", contactothersHb);
        model.addAttribute("srviceRat", "3%");
        model.addAttribute("yearRat", "18%");
        model.addAttribute("LoanAmtUp", "伍仟");
        model.addAttribute("contractEndDate", "20230301");
        model.addAttribute("name", "麻三");
        model.addAttribute("creSn", "XXXXCRESN");
        model.addAttribute("bankCardNo", "6226***********");
        model.addAttribute("bankDesc", "工行银行");

        record Customer(String name, String genger, String birthday, String tel, String qq, String email,
                        String idNo, String idProvince, String idCity,
                        String idDistrict, String idAddrDetail, String idIssuePlace,
                        String liveProvince, String liveCity, String liveDistrict, String liveAddrDetail,
                        String idValidity, String nation, String companyName, String companyProvince,
                        String companyCity, String companyDistrict, String companyAddrDetail) {
        }
        record Contact(String name, String tel, String relation) {
        }
        record Loan(String id, String amount, String amountUp, String periods, String purpose, String monthRate,
                    String repaymentMethod,
                    String firstPayDate, String perPayDate, String repaymentName, String repaymentAccount,
                    String repaymentBank) {
        }
        record FundsSource(String name, String shortName, String logoAddr, String bankName, String bankAccount,
                           String legalRepresentative, String registrationAddr, String tel, String contactAddr) {

        }
        record Repayment(String stages, String date, String mount) {

        }

        model.addAttribute("currentDate", currentDate);
        model.addAttribute("contractDate", currentDate);
        model.addAttribute("contractEndDate", LocalDate.now().plusDays(180));
        model.addAttribute("contractYear", currentDate.substring(0, 4));
        model.addAttribute("contractMonth", currentDate.substring(4, 6));
        model.addAttribute("contractDay", currentDate.substring(6, 8));

        model.addAttribute("xtSn", "T" + currentDate);
        model.addAttribute("customerHotline", "100861001010000");
        model.addAttribute("customerGender", "男");

        model.addAttribute("fontFamily", fontFamily);
//        return "pdf_template12403.html";
        String temp = "pdf_template" + id + ".html";
        System.out.println(temp);
        return temp;
    }

    /**
     * 生成根据模板生成PDF
     * <a href="http://localhost:1987/kim-api/genpdf/12405">...</a>
     *
     * @param id 模板编号
     * @return 路径
     */
    @GetMapping("/gen/{id}")
    @AnonymousKimAccess
    @ResponseBody
    public String genpdf(@PathVariable String id) throws IOException {
        String uri = "http://localhost:1987/kim-api/contract/" + id;
        int nextInt = new Random().nextInt();
        String outputPath = "d:\\contract\\" + id + "-" + fontFamily + "-" + nextInt + ".pdf";
        pdfUtils.generatePdf(uri, outputPath);
        return outputPath + "  pdf_template" + id + ".html";
    }

    @GetMapping("/generatePdf")
    @AnonymousKimAccess
    @ResponseBody
    public String generatePdf() {
        int nano = LocalDateTime.now().getSecond();
        List<String> list = Arrays.asList("12403", "12404", "12405", "12406", "12407", "12412", "12413", "12414", "12415", "12417");
        Random random = new Random();
        int nextInt = random.nextInt();
        int size = Math.abs(nextInt % list.size());
        String id = list.get(size);
        String uri = "http://localhost:1987/kim-api/contract/" + id;
        String outputPath = "d:\\contract\\" + id + "-" + fontFamily + "-" + nextInt + ".pdf";
        try (OutputStream ignored = new FileOutputStream(outputPath)) {
            pdfUtils.generatePdf(uri, outputPath);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println(LocalDateTime.now().getSecond() - nano);
        return outputPath;
    }
}
