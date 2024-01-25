   1)
//        Print Current Date and Time:
//        Write a Java program to print the current date and time.
//import java.time.LocalTime;
//import java.time.LocalDate;
//        public class Main{
//            public static void main(String[] args) {
//                LocalTime time= LocalTime.now();
//                System.out.println(time);
//                LocalDate now = LocalDate.now();
//                System.out.println(now);
//            }
//        }
////        2)
////        Print Date in a Specific Format:
////        Create a program to print the current date in the format "dd/MM/yyyy"
////import java.time.LocalTime;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//        public class Main {
//            public static void main(String[] args) {
//                LocalTime time = LocalTime.now();
//                System.out.println("Current time: " + time);
//                LocalDate now = LocalDate.now();
//                DateTimeFormatter format =
//                        DateTimeFormatter.ofPattern("dd/MM/yyyy");
//                String result = now.format(format);
//                System.out.println("Current date: " + result);
//            }
//        }
//        3)
//        Print Time in a Specific Format:
//        Write a Java code to print the current time in the format "hh:mm:ss".
//import java.time.LocalTime;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//        public class Main {
//            public static void main(String[] args) {
//                LocalTime now = LocalTime.now();
//                DateTimeFormatter timeFormat =
//                        DateTimeFormatter.ofPattern("HH:mm:ss");
//                String formattedTime = now.format(timeFormat);
//                System.out.println("Current time: " +
//                        formattedTime);
//                LocalDate today = LocalDate.now();
//                System.out.println("Current date: " + today);
//            }
//        }
//        4)
//        Print Day of the Week:
//        Develop a program to print the current day of the week
//import java.time.LocalDate;
//import java.time.DayOfWeek;
//        public class Main {
//            public static void main(String[] args) {
//                LocalDate today = LocalDate.now();
//                DayOfWeek dayOfWeek = today.getDayOfWeek();
//                System.out.println("Today is: " + dayOfWeek);
//            }
//        }
//        5)
//        Print Date After Adding Days:
//        Write a Java function that takes an integer input (number of days) and
//        prints the date after adding those days to the current date.
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//        public class Main {
//            public static void main(String[] args) {
//                int daysToAdd = 365;
//                printDateAfterAddingDays(daysToAdd);
//            }
//            public static void printDateAfterAddingDays(int
//                                                                daysToAdd) {
//                LocalDate currentDate = LocalDate.now();
//                LocalDate futureDate =
//                        currentDate.plusDays(daysToAdd);
//                DateTimeFormatter format =
//                        DateTimeFormatter.ofPattern("dd/MM/yyyy");
//                String today = currentDate.format(format);
//                String updated = futureDate.format(format);
//                System.out.println("Current date: " + today);
//                System.out.println("Date after adding " +
//                        daysToAdd + " days: " + updated);
//            }
//        }
//        6)
//        Print Time After Adding Hours:
//        Create a program that takes an integer input (number of hours) and prints
//        the time after adding those hours to the current time.
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//        public class Main {
//            public static void main(String[] args) {
//                int hoursToAdd = 16;
//                printTimeAfterAddingHours(hoursToAdd);
//            }
//            public static void printTimeAfterAddingHours(int
//                                                                 hoursToAdd) {
//                LocalTime currentTime = LocalTime.now();
//                LocalTime futureTime =
//                        currentTime.plusHours(hoursToAdd);
//                DateTimeFormatter format =
//                        DateTimeFormatter.ofPattern("HH:mm:ss");
//                String now = currentTime.format(format);
//                String updated = futureTime.format(format);
//                System.out.println("Current Time: " + now);
//                System.out.println("Time after adding " +
//                        hoursToAdd + " hours: " + updated);
//            }
//        }
//        7) Print Date Difference:
//        Write a Java program to find and print the difference between two
//        given dates.
//import java.time.LocalDate;
//import java.time.Period;
//import java.time.format.DateTimeFormatter;
//        public class Main {
//            public static void main(String[] args) {
//                String date1String = "2022-01-15";
//                String date2String = "2022-01-30";
//                LocalDate date1 = LocalDate.parse(date1String);
//                LocalDate date2 = LocalDate.parse(date2String);
//                Period period = Period.between(date1, date2);
//                System.out.println("Date 1: " +
//                        formatDate(date1));
//                System.out.println("Date 2: " +
//                        formatDate(date2));
//                System.out.println("Difference: " +
//                        formatPeriod(period));
//            }
//            private static String formatDate(LocalDate date) {
//                DateTimeFormatter formatter =
//                        DateTimeFormatter.ofPattern("dd/MM/yyyy");
//                return date.format(formatter);
//            }
//            private static String formatPeriod(Period period){
//                int years = period.getYears();
//                int months = period.getMonths();
//                int days = period.getDays();
//                return years + " years, " + months + " months,
//                " + days + " days";
//            }
//        }
//        8)
//        Print Time Difference:
//        Develop a program to find and print the difference between two given
//        times.
//import java.time.LocalTime;
//import java.time.Duration;
//import java.time.format.DateTimeFormatter;
//        public class Main {
//            public static void main(String[] args) {
//                String time1String = "10:30:00";
//                String time2String = "23:59:30";
//                LocalTime time1 =LocalTime.parse(time1String);
//                LocalTime time2 =LocalTime.parse(time2String);
//                Duration duration = Duration.between(time1,
//                        time2);
//                System.out.println("Time 1: " +
//                        formatTime(time1));
//                System.out.println("Time 2: " +
//                        formatTime(time2));
//                System.out.println("Difference: " +
//                        formatDuration(duration));
//            }
//            private static String formatTime(LocalTime time) {
//                DateTimeFormatter formatter =
//                        DateTimeFormatter.ofPattern("HH:mm:ss");
//                return time.format(formatter);
//            }
//            private static String formatDuration(Duration
//                                                         duration) {
//                long hours = duration.toHours();
//                long minutes = duration.toMinutesPart();
//                long seconds = duration.toSecondsPart();
//                return hours + " hours, " + minutes + "
//                minutes, " + seconds + " seconds";
//            }}
//        9)
//        Print Date in a Specific Time Zone:
//        Create a program that prints the current date and time in a specific time
//        zone.
//import java.time.ZonedDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.TimeZone;
//        public class Main {
//            public static void main(String[] args) {
//                String desiredTimeZoneId = "America/New_York";
//                ZonedDateTime zonedDateTime =
//                        ZonedDateTime.now(TimeZone.getTimeZone(desiredTimeZone
//                                Id).toZoneId());
//                DateTimeFormatter formatter =
//                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//                String formattedDateTime =
//                        zonedDateTime.format(formatter);
//                System.out.println("Current date and time in "
//                        + desiredTimeZoneId + ": " + formattedDateTime);
//            }
//        }
//        10)
//        Print Epoch Time:
//        Write a Java program to print the current epoch time (time in milliseconds
//        since January 1, 1970).
//        public class Main {
//            public static void main(String[] args) {
//                long epochTime = System.currentTimeMillis();
//                System.out.println("Current Epoch Time: " +
//                        epochTime);
//            }
//        }
//    }
//}
