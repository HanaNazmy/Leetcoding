# https://leetcode.com/problems/unique-email-addresses

class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        unique_emails = []
        for email in emails:
            email_splitted = email.split('@')
            local_name = email_splitted[0]
            domain_name = email_splitted[1]
            if '.' in local_name:
                local_name = local_name.replace('.','')
            if '+' in local_name:
                local_splitted = local_name.split('+',1)
                local_name= local_splitted[0]
            email = local_name + '@' + domain_name
            if email not in unique_emails:
                unique_emails.append(email)
                
        return len(unique_emails)
