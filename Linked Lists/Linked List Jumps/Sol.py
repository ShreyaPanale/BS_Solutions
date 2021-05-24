class LLNode:
    def __init__(self, val, next=None):
        self.val = val
        self.next = next
class Solution:
    def solve(self, node):
        temp = LLNode(node.val)
        head = temp
        while(node):
            count=node.val
            while(count and node):
                    node=node.next
                    count -=1
            if(node and count == 0):
                count=node.val
                temp.next=node
                temp=temp.next
            else:
                temp.next=None
        return head
        