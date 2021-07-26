package me.qingy.project.metrics.v2;

import me.qingy.project.metrics.v1.EmailReporter;
import me.qingy.project.metrics.v1.RequestStat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author qingy
 * @since 2021-07-26
 */
public class EmailViewer implements StatViewer {

    private EmailReporter.EmailSender emailSender;
    private List<String> toAddresses = new ArrayList<>();

    public EmailViewer() {
        this.emailSender = new EmailReporter.EmailSender(/*省略参数*/);
    }

    public EmailViewer(EmailReporter.EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void addToAddress(String address) {
        toAddresses.add(address);
    }

    public void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills) {
        // format the requestStats to HTML style.
        // send it to email toAddresses.
    }
}
