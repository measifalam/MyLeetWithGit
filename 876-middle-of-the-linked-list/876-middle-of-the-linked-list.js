/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var middleNode = function(head) {
    let count = 0;
    const dummyHead = new ListNode(null)
    dummyHead.next = head;
    let head1 = dummyHead;
    let head2 = dummyHead;
    
    while(head1.next !== null)
        {
            count++;
            head1 = head1.next
        }
    
    if(count % 2 ==0)
        {
            count++
        }
    i=0;
    while(i<count/2)
        {
            head2 = head2.next
            i++
        }
    return (head2)
    
};