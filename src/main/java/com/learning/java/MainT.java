package com.learning.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MainT {
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    private static String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<Shipments>\n    <Shipment ExpectedDeliveryDate=\"2023-04-10T03:41:21+00:00\" TrackingNo=\"IAM_AAE00004108\" ActualDeliveryDate=\"2023-04-10T03:41:21+00:00\" SCAC=\"AML\">\n        <Extn ExtnStatusCode=\"DL\" ExtnStatusDesc=\"Delivered\"/>\n        <AdditionalDates>\n            <AdditionalDate ActualDate=\"2023-04-10T03:41:21+00:00\" DateTypeId=\"CarrierSODeliveryDate\"/>\n        </AdditionalDates>\n    </Shipment>\n</Shipments>\n";


    public static void main(String[] args) {
        Double res1 = (double)2598 / 21.0f;
        Double res2 = (double)200 / 21.0f;
        System.out.println(res1);
        BigDecimal bd = BigDecimal.valueOf(res1).setScale(2,RoundingMode.CEILING);
        System.out.println(bd);
        System.out.println(res2);
        BigDecimal bd1 = BigDecimal.valueOf(res2).setScale(2,RoundingMode.CEILING);
        BigDecimal bd2 = BigDecimal.valueOf(res2).setScale(2,RoundingMode.CEILING);
        System.out.println(bd1.equals(bd2));
    }
}




class Helper {
    static String getFirstName(String name) {
        if (name == null)
            return "";
        String trimmedString = name;
        if (name.length() > 60)
            trimmedString = name.substring(0, 60);
        int index = trimmedString.indexOf(" ");
        if (index == -1)
            return trimmedString;
        return trimmedString.substring(0, index);
    }

    static String getLastName(String name) {
        if (name == null)
            return "";
        String trimmedString = name;
        if (name.length() > 60)
            trimmedString = name.substring(0, 60);
        int index = trimmedString.indexOf(" ");
        System.out.println("index = " + index);
        if (index == -1)
            return getFirstName(name);
        return trimmedString.substring(index + 1);
    }

    static String removeStandalone(String xml) {
        String res = "";
        int idx = xml.indexOf("standalone");
        System.out.println("idx = " + idx);
        res = xml.substring(0, idx - 1) + xml.substring(idx + 16);
        return res;
    }

    public static String getAwb(String awb) {
        return awb.substring(0,awb.indexOf('_')+1);
    }

    public static void print(List<Integer> l) {
        if (Objects.isNull(l)) {
            System.out.println("null list passed");
            return;
        }
        for (Integer i: l) {
            System.out.println(i);
        }
    }
}

