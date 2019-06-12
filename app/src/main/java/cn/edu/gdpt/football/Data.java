package cn.edu.gdpt.football;

import java.util.List;

public class Data {

    /**
     * msg : success
     * result : [{"date":"2013-08-25","homeTeam":"柏林赫塔","homeTeamMatchInfo":[{"goalPlayerNameCn":"阿德里安-拉莫斯","goalTime":"74"}],"homeTeamScore":"1","leagueTypeCn":"德甲","matchCity":"柏林","round":3,"season":"2013","situation":"奥林匹克球场","status":3,"time":"00:30","visitors":"汉堡","visitorsMatchInfo":[],"visitorsScore":"0"},{"date":"2013-08-25","homeTeam":"不伦瑞克","homeTeamMatchInfo":[],"homeTeamScore":"0","leagueTypeCn":"德甲","matchCity":"不伦瑞克","round":3,"season":"2013","situation":"和谐球场","status":3,"time":"21:30","visitors":"法兰克福","visitorsMatchInfo":[{"goalPlayerNameCn":"艾格纳","goalTime":"62"},{"goalPlayerNameCn":"梅耶尔","goalTime":"52"}],"visitorsScore":"2"},{"date":"2013-08-25","homeTeam":"奥格斯堡","homeTeamMatchInfo":[{"goalPlayerNameCn":"布拉克","goalTime":"36"},{"goalPlayerNameCn":"哈伊尔-阿尔滕托普","goalTime":"6"}],"homeTeamScore":"2","leagueTypeCn":"德甲","matchCity":"奥格斯堡","round":3,"season":"2013","situation":"SGL球场","status":3,"time":"23:30","visitors":"斯图加特","visitorsMatchInfo":[{"goalPlayerNameCn":"伊比舍维奇","goalTime":"42"}],"visitorsScore":"1"},{"date":"2013-08-24","homeTeam":"多特蒙德","homeTeamMatchInfo":[{"goalPlayerNameCn":"莱万多夫斯基","goalTime":"55"}],"homeTeamScore":"1","leagueTypeCn":"德甲","matchCity":"多特蒙德","round":3,"season":"2013","situation":"伊度纳公园","status":3,"time":"02:30","visitors":"不莱梅","visitorsMatchInfo":[],"visitorsScore":"0"},{"date":"2013-08-24","homeTeam":"美因茨","homeTeamMatchInfo":[{"goalPlayerNameCn":"尼古拉-穆勒","goalTime":"78"},{"goalPlayerNameCn":"楚波莫廷","goalTime":"60"}],"homeTeamScore":"2","leagueTypeCn":"德甲","matchCity":"美因茨","round":3,"season":"2013","situation":"科法斯球场","status":3,"time":"21:30","visitors":"沃尔夫斯堡","visitorsMatchInfo":[],"visitorsScore":"0"},{"date":"2013-08-24","homeTeam":"霍芬海姆","homeTeamMatchInfo":[{"goalPlayerNameCn":"萨利霍维奇","goalTime":"9"},{"goalPlayerNameCn":"弗兰德","goalTime":"25"},{"goalPlayerNameCn":"斯特罗布尔","goalTime":"77"}],"homeTeamScore":"3","leagueTypeCn":"德甲","matchCity":"辛斯海姆","round":3,"season":"2013","situation":"内卡竞技场","status":3,"time":"21:30","visitors":"弗赖堡","visitorsMatchInfo":[{"goalPlayerNameCn":"索格","goalTime":"13"},{"goalPlayerNameCn":"古埃德斯","goalTime":"29"},{"goalPlayerNameCn":"弗雷希","goalTime":"65"}],"visitorsScore":"3"},{"date":"2013-08-24","homeTeam":"勒沃库森","homeTeamMatchInfo":[{"goalPlayerNameCn":"卡斯特罗","goalTime":"72"},{"goalPlayerNameCn":"萨姆","goalTime":"28"},{"goalPlayerNameCn":"萨姆","goalTime":"60"},{"goalPlayerNameCn":"基斯林","goalTime":"23"}],"homeTeamScore":"4","leagueTypeCn":"德甲","matchCity":"勒沃库森","round":3,"season":"2013","situation":"拜耳球场","status":3,"time":"21:30","visitors":"门兴","visitorsMatchInfo":[{"goalPlayerNameCn":"斯特兰茨尔","goalTime":"54"},{"goalPlayerNameCn":"阿朗戈","goalTime":"57"}],"visitorsScore":"2"},{"date":"2013-08-24","homeTeam":"拜仁慕尼黑","homeTeamMatchInfo":[{"goalPlayerNameCn":"罗本","goalTime":"78"},{"goalPlayerNameCn":"里贝里","goalTime":"69"}],"homeTeamScore":"2","leagueTypeCn":"德甲","matchCity":"慕尼黑","round":3,"season":"2013","situation":"安联球场","status":3,"time":"21:30","visitors":"纽伦堡","visitorsMatchInfo":[],"visitorsScore":"0"},{"date":"2013-08-24","homeTeam":"汉诺威96","homeTeamMatchInfo":[{"goalPlayerNameCn":"胡兹蒂","goalTime":"15"},{"goalPlayerNameCn":"马梅-迪乌夫","goalTime":"42"}],"homeTeamScore":"2","leagueTypeCn":"德甲","matchCity":"汉诺威","round":3,"season":"2013","situation":"HDI球场","status":3,"time":"21:30","visitors":"沙尔克04","visitorsMatchInfo":[{"goalPlayerNameCn":"斯扎莱","goalTime":"55"}],"visitorsScore":"1"}]
     * retCode : 200
     */

    private String msg;
    private String retCode;
    private List<ResultBean> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * date : 2013-08-25
         * homeTeam : 柏林赫塔
         * homeTeamMatchInfo : [{"goalPlayerNameCn":"阿德里安-拉莫斯","goalTime":"74"}]
         * homeTeamScore : 1
         * leagueTypeCn : 德甲
         * matchCity : 柏林
         * round : 3
         * season : 2013
         * situation : 奥林匹克球场
         * status : 3
         * time : 00:30
         * visitors : 汉堡
         * visitorsMatchInfo : []
         * visitorsScore : 0
         */

        private String date;
        private String homeTeam;
        private String homeTeamScore;
        private String leagueTypeCn;
        private String matchCity;
        private int round;
        private String season;
        private String situation;
        private int status;
        private String time;
        private String visitors;
        private String visitorsScore;
        private List<HomeTeamMatchInfoBean> homeTeamMatchInfo;
        private List<?> visitorsMatchInfo;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getHomeTeam() {
            return homeTeam;
        }

        public void setHomeTeam(String homeTeam) {
            this.homeTeam = homeTeam;
        }

        public String getHomeTeamScore() {
            return homeTeamScore;
        }

        public void setHomeTeamScore(String homeTeamScore) {
            this.homeTeamScore = homeTeamScore;
        }

        public String getLeagueTypeCn() {
            return leagueTypeCn;
        }

        public void setLeagueTypeCn(String leagueTypeCn) {
            this.leagueTypeCn = leagueTypeCn;
        }

        public String getMatchCity() {
            return matchCity;
        }

        public void setMatchCity(String matchCity) {
            this.matchCity = matchCity;
        }

        public int getRound() {
            return round;
        }

        public void setRound(int round) {
            this.round = round;
        }

        public String getSeason() {
            return season;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public String getSituation() {
            return situation;
        }

        public void setSituation(String situation) {
            this.situation = situation;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getVisitors() {
            return visitors;
        }

        public void setVisitors(String visitors) {
            this.visitors = visitors;
        }

        public String getVisitorsScore() {
            return visitorsScore;
        }

        public void setVisitorsScore(String visitorsScore) {
            this.visitorsScore = visitorsScore;
        }

        public List<HomeTeamMatchInfoBean> getHomeTeamMatchInfo() {
            return homeTeamMatchInfo;
        }

        public void setHomeTeamMatchInfo(List<HomeTeamMatchInfoBean> homeTeamMatchInfo) {
            this.homeTeamMatchInfo = homeTeamMatchInfo;
        }

        public List<?> getVisitorsMatchInfo() {
            return visitorsMatchInfo;
        }

        public void setVisitorsMatchInfo(List<?> visitorsMatchInfo) {
            this.visitorsMatchInfo = visitorsMatchInfo;
        }

        public static class HomeTeamMatchInfoBean {
            /**
             * goalPlayerNameCn : 阿德里安-拉莫斯
             * goalTime : 74
             */

            private String goalPlayerNameCn;
            private String goalTime;

            public String getGoalPlayerNameCn() {
                return goalPlayerNameCn;
            }

            public void setGoalPlayerNameCn(String goalPlayerNameCn) {
                this.goalPlayerNameCn = goalPlayerNameCn;
            }

            public String getGoalTime() {
                return goalTime;
            }

            public void setGoalTime(String goalTime) {
                this.goalTime = goalTime;
            }
        }
    }
}
