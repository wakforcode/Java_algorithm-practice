import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wzk
 * @description
 * @Date 2022/9/19 17:45
 */
public class Wzk20220919 {


    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
     */
    public int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();


        int maxNum = 0;

        for (int i = 0; i <= chars.length - 1; i++) {

            List<Character> characterList = new ArrayList<>();
            characterList.add(chars[i]);
            int num = 1;
            int j = i + 1;
            while (j < chars.length && !characterList.contains(chars[j])) {
                characterList.add(chars[j]);
                num++;
                j++;
            }
            if (characterList.size() > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }


    public static void main(String[] args) {

        Wzk20220919 wzk20220919 = new Wzk20220919();
        wzk20220919.lengthOfLongestSubstring("pwwkew");


//        LocalDateTime now = LocalDateTime.now();
//        ZoneId zoneId = ZoneId.systemDefault();
//        LocalDateTime firstDayOfNextMonth = now.with(TemporalAdjusters.firstDayOfNextMonth()).withHour(0).withMinute(0).withSecond(0);
//        LocalDateTime lastDayOfNextMonth = now.plus(1, ChronoUnit.MONTHS).with(TemporalAdjusters.lastDayOfMonth()).withHour(23).withMinute(59).withSecond(58);
//        Date firstDayOfNextMonthDate = Date.from(firstDayOfNextMonth.atZone(zoneId).toInstant());
//        Date lastDayOfNextMonthDate = Date.from(lastDayOfNextMonth.atZone(zoneId).toInstant());
//        System.out.println();

    }

}
