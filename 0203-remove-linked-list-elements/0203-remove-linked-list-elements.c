/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode* prev,*curr;
     while(head != NULL && head->val == val)
        // Skip the value and keep updating head node...
        head = head->next;
       curr=head;
     while(curr != NULL){
        // If we find the target val same as the value of curr...
        if(curr->val == val){
            // Skip that value and keep updating...
            prev->next = curr->next;
        }
        // Move prev when the next node of prev is not 'val'
        else{
            prev = curr;
        }
        // Move curr forward...
        curr = curr->next;
    }
       return head;
}