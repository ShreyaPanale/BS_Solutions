class LLNode:
    def __init__(self, val, next=None):
        self.val = val
        self.next = next
class Solution:
    def solve(self, head):
        if(head):
            prev=head.val
            head=head.next
            while(head):
                if(head.val>prev):
                    prev=head.val
                    head=head.next
                else:
                    return False

        return True
