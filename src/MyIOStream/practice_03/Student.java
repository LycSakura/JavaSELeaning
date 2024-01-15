package MyIOStream.practice_03;

public class Student {
    private String name;
    private double ChinesScore;
    private double MathScore;
    private double EnglishScore;

    public Student() {
    }

    public Student(String name, double chinesScore, double mathScore, double englishScore) {
        this.name = name;
        ChinesScore = chinesScore;
        MathScore = mathScore;
        EnglishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinesScore() {
        return ChinesScore;
    }

    public void setChinesScore(double chinesScore) {
        ChinesScore = chinesScore;
    }

    public double getMathScore() {
        return MathScore;
    }

    public void setMathScore(double mathScore) {
        MathScore = mathScore;
    }

    public double getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(double englishScore) {
        EnglishScore = englishScore;
    }
    public double getSum(){
        return this.ChinesScore + this.EnglishScore + this.MathScore;
    }

}
