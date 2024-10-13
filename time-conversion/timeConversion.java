public static String timeConversion(String s) {
    String period = s.substring(s.length()-2);
    String time = s.substring(0,s.length()-2);
    String[] timeArr = time.split(":");
    
    int hours = Integer.parseInt(timeArr[0]);
    
    if(period.equals("PM") && hours != 12){
        hours+=12;
    }else if(period.equals("AM") && hours == 12){
        hours=0;
        
    }
    
    
    
    return String.format("%02d:%s:%s", hours, timeArr[1], timeArr[2]);

    }

