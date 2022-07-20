package day02;
public class StringDemo {
    public static void main(String[] args) {
        String s = urlAppend(0, 2, 4, 2);
        System.out.println(s);
    }
    public static String urlAppend(int workYear, int salary, int degree, int companyType) {
        String result = "https://search.51job.com";
        String[] workYearArr = {"所有","在校生/应届生","1-3年","3-5年","5-10年","10年以上","无需经验"};
        String[] salaryArray = {"所有","2k以下","2-4k","4-5k","5-7k","7-9k","9-10k","10k以上"};
        String[] degreeArray = {"所有","初中及以下","高中/中专/大专","本科","硕士","博士","无学历要求"};
        String[] companyTypeArray = {"所有","国企","外资","上市公司","合资","民营企业","央企"};
        if(workYear > 0 && workYear < workYearArr.length) result += "&workYear=" + workYearArr[workYear];
        if(salary > 0 && salary < salaryArray.length) result += "&minSalary=" + salaryArray[salary];
        if(degree > 0 && degree < degreeArray.length) result += "&degree=" + degreeArray[degree];
        if(companyType > 0 && companyType < companyTypeArray.length) result += "&companyType=" + companyTypeArray[companyType];
        return result.replaceFirst("&", "?");
    }
}
