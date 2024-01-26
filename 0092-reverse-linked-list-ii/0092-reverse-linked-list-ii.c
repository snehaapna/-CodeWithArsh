/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
   


struct ListNode* reverseBetween(struct ListNode* head, int left, int right){
    struct ListNode *p = head,*k=head;
    int i = 1,kk=0;
    int a[100000];
    while(p!=NULL){
        if (i>=left && i<=right){
            a[kk++]=p->val;
        }
        p=p->next;
        i++;
    }
    i=1;
    while(k!=NULL){
        if (i>=left && i<=right){
            k->val=a[--kk];
        }
        k=k->next;
        i++;
    }
    return head;
}