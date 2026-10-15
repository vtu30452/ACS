public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode S = head;
        ListNode F = head;
        while (F != null && F.next != null) {
            S = S.next;
            F = F.next.next;
            if (S == F) {
                S = head;
                while (S != F) {
                    S = S.next;
                    F = F.next;
                }
                return S;
            }
        }
        return null;
    }
}