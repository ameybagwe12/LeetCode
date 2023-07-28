//package LinkedList;
//
//public class FastSlow {
//    public static void main(String[] args) {
//
//    }
//
//}
//      ListNode deleteMiddle(ListNode head) {
//        if(head == null || head.next == null) {
//            head = null;
//            return head;
//        }
//        else {
//            ListNode fast = head;
//            ListNode slow = head;
//            ListNode prev = null;
//            while (fast != null && fast.next != null) {
//                prev = slow;
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//            prev.next = slow.next;
//            slow.next = null;
//            return head;
//        }
//
//    }
