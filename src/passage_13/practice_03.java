package passage_13;

import java.text.DecimalFormat;
import java.util.Date;

/*模拟银行存钱*/
public class practice_03 {
    public static void main(String[] args) {
        BankList<Object> bankList = new BankList<>();

        bankList.setBankname("中国建设银行");
        bankList.time = new Date();
        bankList.setName("赵四");
        bankList.setCard("6666 7777 8888 9996 789");
        bankList.setVariety("RMB");
        bankList.setPrice(8888.00);
        bankList.setBalabce(18888.88);
        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println(bankList.getName() + "于" + bankList.time +
                ",在中国" + bankList.getBankname() +
                "向账号为:" + bankList.getCard() +
                "的银行卡上存入:" + bankList.getPrice() + bankList.getVariety() + "" +
                ",存入后卡上余额还有" + bankList.getBalabce() + bankList.getVariety());
    }
}

class BankList<T> {
    public T time;
    private T bankname;
    private T name;
    private T Card;
    private T variety;
    private T price;
    private T balabce;

    public BankList() {
    }

    public T getBankname() {
        return bankname;
    }

    public void setBankname(T bankname) {
        this.bankname = bankname;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getCard() {
        return Card;
    }

    public void setCard(T card) {
        Card = card;
    }

    public T getVariety() {
        return variety;
    }

    public void setVariety(T variety) {
        this.variety = variety;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public T getBalabce() {
        return balabce;
    }

    public void setBalabce(T balabce) {
        this.balabce = balabce;
    }
}
