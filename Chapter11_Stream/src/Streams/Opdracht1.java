package Streams;

import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Opdracht1 {

    public List toUpperCase(List<String> strings) {
        return strings = strings.stream().map(String::toUpperCase)
                .toList();
    }

    public List filterA(List<String> strings) {
        return strings.stream().filter(f -> f.startsWith("A"))
                .collect(Collectors.toList());
    }

    public List filterB(List<String> strings) {
        return strings.stream().filter(f -> f.startsWith("A"))
                .filter(l -> l.length()>3)
                .collect(Collectors.toList());

    }

    public List filterC(List<String> strings) {
        return strings.stream().filter(f -> f.startsWith("A"))
                .filter(l -> l.length()>3)
                .map(r -> new StringBuilder(r).reverse())
                .map(r -> new String(r))
                .collect(Collectors.toList());
    }

    public String filterD(List<String> strings) {
        strings = strings.stream().filter(f -> f.startsWith("A"))
                .filter(l -> l.length()>3)
                .map(r -> new StringBuilder(r).reverse())
                .map(r -> new String(r))
                .toList();
        return strings.stream().collect(Collectors.joining(", "));
    }

    public String filterE(List<String> strings) {
        strings = strings.stream().filter(f -> f.startsWith("A"))
                .filter(l -> l.length()>3)
                .map(r -> new StringBuilder(r).reverse())
                .map(r -> new String(r))
                .toList();
        return strings.stream().map(h -> h.toUpperCase())
                .collect(Collectors.joining(", "));

    }

    public String filterF(List<String> strings) {
        strings = strings.stream().filter(f -> f.startsWith("A"))
                .filter(l -> l.length()>3)
                .map(r -> new StringBuilder(r).reverse())
                .map(r -> new String(r))
                .toList();
        return strings.stream().map(h -> h.toUpperCase())
                .collect(Collectors.joining(", "))
                .substring(0,10);
    }

    public String filterG(List<String> strings) {
        strings = strings.stream().filter(f -> f.startsWith("A"))
                .filter(l -> l.length()>3)
                .map(r -> new StringBuilder(r).reverse())
                .map(r -> new String(r))
                .toList();
        return strings.stream().map(h -> h.toUpperCase())
                .collect(Collectors.joining(", "))
                .substring(0,10)
                .replaceAll("CAIRUA, AJ", "Start : CAIRUA, AJ : End");
    }

    public String filterH(List<String> strings) {
        strings = strings.stream().filter(f -> f.startsWith("A"))
                .filter(l -> l.length() > 3)
                .map(r -> new StringBuilder(r).reverse())
                .map(r -> new String(r))
                .toList();
        return strings.stream().map(h -> h.toUpperCase())
                .collect(Collectors.joining(", "))
                .substring(0, 10)
                .replaceAll("CAIRUA, AJ", "Start : CAIRUA, AJ : End")
                .concat(" --> 1");
    }

        public String filterI(List<String> strings) {
            Random random = new Random();
            int ran = random.nextInt(100);
            strings = strings.stream().filter(f -> f.startsWith("A"))
                    .filter(l -> l.length() > 3)
                    .map(r -> new StringBuilder(r).reverse())
                    .map(r -> new String(r))
                    .toList();
            return strings.stream().map(h -> h.toUpperCase())
                    .collect(Collectors.joining(", "))
                    .substring(0, 10)
                    .replaceAll("CAIRUA, AJ", "Start : CAIRUA, AJ : End")
                    .concat(" --> " + ran );
        }

}
