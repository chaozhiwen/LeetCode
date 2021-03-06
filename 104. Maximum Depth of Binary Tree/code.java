import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;

        Queue<TreeNode> q=new LinkedList<>();
        int ans=0;
        TreeNode r=root;
        q.add(r);
        while(!q.isEmpty()){
            int count=q.size();
            while(count>0){
                TreeNode tmp=q.poll();
                if(tmp.left!=null)
                    q.add(tmp.left);
                if(tmp.right!=null)
                    q.add(tmp.right);
                count--;
            }
            ans++;
        }
        return ans;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		/*          1              */
		/*        /    \            */
		/*       2      3           */
		/*      / \    / \          */
		/*     4   5  6   7         */
		TreeNode t1=new TreeNode(1);
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		TreeNode t5=new TreeNode(5);
		TreeNode t6=new TreeNode(6);
		TreeNode t7=new TreeNode(7);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		System.out.println(s.maxDepth(t1));
		
		
		
		/*       1              */
		/*      / \             */
		/*     2   3            */
		/*    / \   \           */
		/*   4   5   6          */
		TreeNode g1=new TreeNode(1);
		TreeNode g2=new TreeNode(2);
		TreeNode g3=new TreeNode(3);
		TreeNode g4=new TreeNode(4);
		TreeNode g5=new TreeNode(5);
		TreeNode g6=new TreeNode(6);
		g1.left=g2;
		g1.right=g3;
		g2.left=g4;
		g2.right=g5;
		g3.right=g6;
		System.out.println(s.maxDepth(g1));
		
		
		/*       1              */
		/*      / \             */
		/*     2   3            */
		/*    /     \           */
		/*   4       5          */
		TreeNode q1=new TreeNode(1);
		TreeNode q2=new TreeNode(2);
		TreeNode q3=new TreeNode(3);
		TreeNode q4=new TreeNode(4);
		TreeNode q5=new TreeNode(5);
		q1.left=q2;
		q1.right=q3;
		q2.left=q4;
		q3.right=q5;
		System.out.println(s.maxDepth(q1));
		
		/*            1             */
		/*           /              */
		/*          2               */
		/*         /                */
		/*        3                 */
		/*         \                */
		/*          4                 */
		/*         /                 */
		/*        5                 */
		/*         \                 */
		/*          6                 */
		/*           \                 */
		/*            7                 */
		/*           / \                 */
		/*          8   9                 */
		TreeNode x1=new TreeNode(1);
		TreeNode x2=new TreeNode(2);
		TreeNode x3=new TreeNode(3);
		TreeNode x4=new TreeNode(4);
		TreeNode x5=new TreeNode(5);
		TreeNode x6=new TreeNode(6);
		TreeNode x7=new TreeNode(7);
		TreeNode x8=new TreeNode(8);
		TreeNode x9=new TreeNode(9);
		x1.left=x2;
		x2.left=x3;
		x3.right=x4;
		x4.left=x5;
		x5.right=x6;
		x6.right=x7;
		x7.left=x8;
		x7.right=x9;
		System.out.println(s.maxDepth(x1));
	}
}
