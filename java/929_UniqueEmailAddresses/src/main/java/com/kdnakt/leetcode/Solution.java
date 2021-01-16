package com.kdnakt.leetcode;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

/**
 * Every email consists of a local name and a domain name,
 * separated by the @ sign.
 * For example, in alice@leetcode.com,
 * alice is the local name,
 * and leetcode.com is the domain name.
 * Besides lowercase letters,
 * these emails may contain '.'s or '+'s.
 * If you add periods ('.') between some characters
 * in the local name part of an email address,
 * mail sent there will be forwarded
 * to the same address without dots in the local name.
 * For example, "alice.z@leetcode.com"
 * and "alicez@leetcode.com" forward
 * to the same email address.
 * (Note that this rule does not apply for domain names.)
 * 
 * If you add a plus ('+') in the local name,
 * everything after the first plus sign will be ignored.
 * This allows certain emails to be filtered,
 * for example m.y+name@email.com will be forwarded
 * to my@email.com.
 * (Again, this rule does not apply for domain names.)
 * 
 * It is possible to use both of these rules at the same time.
 * Given a list of emails,
 * we send one email to each address in the list.
 * How many different addresses actually receive mails?
 * 
 * Note:
 * 1 <= emails[i].length <= 100
 * 1 <= emails.length <= 100
 * Each emails[i] contains exactly one '@' character.
 * All local and domain names are non-empty.
 * Local names do not start with a '+' character.
 */
public class Solution {

    public int numUniqueEmails(String[] emails) {
        Map<String, Set<String>> domainMap = new HashMap<>();
        int res = 0;
        for (String email : emails) {
            String[] localAndDomain = email.split("@");
            String local = localAndDomain[0].split("\\+")[0].replaceAll("\\.", "");
            String domain = localAndDomain[1];
            if (!domainMap.containsKey(domain)) domainMap.put(domain, new HashSet<>());
            Set locals = domainMap.get(domain);
            if (locals.add(local)) {
                res++;
            }
        }
        return res;
    }

}
