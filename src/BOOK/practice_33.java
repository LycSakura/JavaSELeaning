package BOOK;

public class practice_33 {
    public static void main(String[] args) {
        System.out.println("--------------银行卡--------------");
        BankCard bankCard = new BankCard();
        bankCard.cardNum = "6224 4569 2421 3677";
        bankCard.saveMoney();
        System.out.println("--------------储蓄卡--------------");
        SavingCard savingCard = new SavingCard();
        savingCard.cardNum = "6212 2636 0001 2739";
        savingCard.saveMoney();
        savingCard.drawMoney();
        System.out.println("--------------信用卡--------------");
        CreditCard creditCard = new CreditCard();
        creditCard.cardNum = "4013 7356 3380 0642";
        creditCard.saveMoney();
        creditCard.drawMoney();
        creditCard.borrowMoney();
    }
}

class BankCard {
    String cardNum;

    public void saveMoney() {
        System.out.println("你的卡号:" + cardNum + "的卡存了钱");
    }
}

class CreditCard extends BankCard {
    public void drawMoney() {
        System.out.println("你的卡号为:" + cardNum + "还有钱");
    }

    public void borrowMoney() {
        System.out.println("你的卡号为:" + cardNum + "借了钱");
    }
}

class SavingCard extends BankCard {
    public void drawMoney() {
        System.out.println("你的卡号为:" + cardNum + "还有钱");
    }
}

