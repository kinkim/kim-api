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
            font-size: 12px;
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
    <h1>委托扣款协议</h1>
    <p class="lineHeightText">甲方： 重庆两江新区宝升小额贷款股份有限公司</p>
    <p class="lineHeightText">法定代表人：郑伟京</p>
    <p class="lineHeightText">住所：重庆市两江新区财富大道2号财富A座17-6</p>
    <br />
    <p class="lineHeightText">乙方：【${member.realName}】</p>
    <p class="lineHeightText">身份证号码：【${member.creSn}】</p>
    <p class="lineHeightText">联系电话：${member.mobile}</p>
    <br />
    <p class="lineHeightText">鉴于：</p>
    <p class="lineHeightText textIndent">甲方与乙方签订了编号为__________________的《借款合同》（下称《借款合同》）后，为便于乙方按期偿还借款本金、利息等一切因《借款合同》产生的乙方应支付的费用，甲乙双方约定,由甲方在每个还款日从乙方指定的账户中扣款，具体约定如下：</p>
    <p class="lineHeightText textIndent">一、乙方、丙方委托甲方于每个还款日当天依据本协议约定在乙方指定账户中扣取当期应还款项。</p>
    <p class="lineHeightText textIndent">二、扣款时间</p>
    <p class="lineHeightText textIndent">扣款时间为《借款合同》约定的还款日，若还款日为节假日的，<b>乙方无权推迟还款日，甲方有权在当日扣款；</b></p>
    <p class="lineHeightText textIndent">甲方亦有权推迟节假日后第一个工作日进行扣款，因甲方推迟扣款，且推迟后甲方能够从乙方指定账户中足额扣款的，不视为乙方逾期还款，<b>因甲方推迟扣款，但推迟后甲方未能从乙方指定账户中足额扣款的，未能足额扣款的部分视为乙方自《借款合同》约定的还款日起逾期违约。</b></p>
    <p class="lineHeightText textIndent"><b>乙方知悉、了解并同意该条约定。</b></p>
    <p class="lineHeightText textIndent">三、扣款方式</p>
    <p class="lineHeightText textIndent">于《借款合同》约定的还款日当天，甲方按乙方当期应还借款本息等款项的金额一次性全额扣款，若成功扣款，视为乙方成功还款，结束当期扣款流程；若未能成功扣款的，则甲方按照当期应还金额的50%重新进行扣款，若成功扣款，则甲方再次按照当期应还金额的50%重新进行扣款，若扣款不成功，则甲方再次按照当期应还金额的25%进行扣款；甲方的第三次扣款无论是否成功扣款，甲方结束当期扣款流程，成功扣款的部分视为乙方当期已还款项，其余未成功扣款的部分视为乙方逾期还款。</p>
    <p class="lineHeightText textIndent">四、乙方保证签订本协议后，甲方依据本协议约定扣款时，乙方指定的账户内有足额的款项，如因指定账户内没有足额款项导致甲方不能足额扣款的，未能成功扣款的部分视为乙方逾期还款，由乙方承担逾期还款的违约责任，且逾期还款的部分，<b>甲方不再依照本协议进行扣款，由乙方自行还款。</b></p>
    <p class="lineHeightText textIndent">五、乙方指定的扣款账户为：</p>
    <p class="lineHeightText textIndent">户  名：【 ${member.loan.repaymentName} 】</p>
    <p class="lineHeightText textIndent">账  号：【 ${member.loan.repaymentAccount} 】</p>
    <p class="lineHeightText textIndent">开户行：【 ${member.paramMap.repaymentBank}  】</p>
    <p class="lineHeightText textIndent">六、甲乙双方应当对履行该协议过程中知悉的其他方的信息承担保密责任，如违反本协议泄漏相关信息造成对方损失的，过错一方应当承担赔偿责任。</p>
    <p class="lineHeightText textIndent">七、本协议的签订、履行、终止、解释均适用中华人民共和国法律，双方就本协议产生的纠纷由甲方所在地人民法院管辖。</p>
    <p class="lineHeightText textIndent">八、本协议采用电子文本形式制成，自签订之日起生效。各方均同意以网络页面点击确认的方式或以其他方式签订本协议，并不以此为由拒绝履行本协议项下的义务。</p>
    <p class="lineHeightText textIndent">（以下无正文）</p>
    <br />
 
    <p class="textIndent">
        <strong>甲方：重庆两江新区宝升小额贷款股份有限公司</strong>
    </p>
    <p class="textIndent" style="margin: 100px 0px 70px 0px;"><strong>乙方：________</strong></p>
    <p class="textIndent" style="margin-left: 25%;"><span>本协议签订日期：<u> ${currYear} </u>年<u> ${currMonth} </u>月<u> ${currDay} </u>日</span></p>
    <br />
</body>

</html>