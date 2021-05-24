class LLNode:
    def __init__(self, val, next=None):
        self.val = val
        self.next = next
class Solution:
    def solve(self, node):
        num=""
        while(node):
            num+=str(node.val)
            node=node.next

        return int(num,2)