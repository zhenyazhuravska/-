package org.restws.bean;

import javax.ws.rs.QueryParam;

public class FilterBean {
    @QueryParam("year") int year;
    @QueryParam("from") int from;
    @QueryParam("to") int to;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchParamBean{");
        sb.append("year='").append(year).append('\'');
        sb.append(", from='").append(from).append('\'');
        sb.append(", to='").append(to).append('\'');
        sb.append('}');
        return sb.toString();
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
}
