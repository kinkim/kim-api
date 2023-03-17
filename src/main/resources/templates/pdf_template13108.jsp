<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../inc_common.jsp" %>
<%@ include file="../../inc_doctype.jsp" %>
<jsp:useBean id="constant" scope="page"
             class="com.dragon.plat.common.Constant"></jsp:useBean>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Untitled Document</title>
    <style>
        * {
            font-size: 15px;
            font-family: "SimSun";
        }

        body {
            margin: 0;
            padding: 0;
        }

        h1 {
            position: relative;
            text-align: center;
            height: 71px;
            line-height: 71px;
            font-size: 18px;
            font-weight: bold;
            margin: 0;
            padding: 0;
        }

        h1 img {
            position: absolute;
            left: 10px;
            top: 0px;
        }

        h3 {
            line-height: 6px;
        }

        h2 {
            position: relative;
            text-align: center;
            height: 51px;
            line-height: 31px;
            font-size: 20px;
            font-weight: bold;
            margin: 0;
            padding: 0;
        }

        h2 img {
            position: absolute;
            left: 10px;
            top: 8px;
        }

        table {
            margin: 7px;
            table-layout: fixed;
            width: 98%;
            margin: 0 auto;
        }

        table tr td {
            height: 6px;
        }

        .p-left {
            margin: 3px 0;
        }

        p {
            margin: 0;
        }

        .lineHeightText {
            line-height: 20px;
        }
        .textIndent{ text-indent:2em;}
    </style>
</head>

<body style="width: 100%;">
    <h1>收款账户确认函</h1>
    <p class="lineHeightText">致重庆两江新区宝升小额贷款股份有限公司：</p>
    <p class="lineHeightText textIndent">本人（姓名：【 ${member.realName}】; 身份证号码： 【 ${member.creSn} 】）与 重庆两江新区宝升小额贷款股份有限公司签订《借款协议》借入相应款项（金额以具体协议为准）。</p>
    <p class="lineHeightText textIndent">现本人确认，重庆两江新区宝升小额贷款股份有限公司公司交付的借款支付至本人指定的如下账户：</p>
    <p class="lineHeightText textIndent">开户行：【 ${member.paramMap.repaymentBank}  】</p>
    <p class="lineHeightText textIndent">账户名：【 ${member.loan.repaymentName} 】</p>
    <p class="lineHeightText textIndent">账  号：【 ${member.loan.repaymentAccount} 】</p>
    <p class="lineHeightText textIndent">重庆两江新区宝升小额贷款股份有限公司将借款支付至本人指定的上述账户后，视为本人已收到该笔借款。放款至该账户的所有法律后果由本人自行承担。</p>
    <br />
 
    <p class="textIndent" style="margin-left: 40%;">
        <span>承诺人：____________________________</span>
    </p>
    <br />
    <p class="textIndent" style="margin-left: 40%;"><span>日期：<u> ${currDate} </u></span></p>
    <br />
</body>

</html>
