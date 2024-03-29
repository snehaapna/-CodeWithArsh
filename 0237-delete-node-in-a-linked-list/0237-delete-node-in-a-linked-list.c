/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    struct ListNode*prev,*curr;
    prev=node;
    curr=node->next;
  
    while(curr!=NULL)
    {
        int temp=prev->val;
        prev->val=curr->val;
        curr->val=temp;
        
        if(prev->next->next==NULL)
        {
           prev->next=NULL;
            curr=curr->next;
        }
        else
        {
             prev=prev->next;
        curr=curr->next;
        }
    }
}
            
            
    