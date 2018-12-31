## 题目
给定一个二叉树，返回它的中序 遍历。
## 思路
中序遍历：左子树->根结点->右子树  
深度优先搜索，类似于[前序遍历](https://github.com/chaozhiwen/LeetCode-in-Java/tree/master/144.%20Binary%20Tree%20Preorder%20Traversal)  
利用栈结构，先将根结点压栈，然后将其左结点一个接一个压栈，直到指针指向空。然后访问栈顶项，接着令其出栈，将指针指向其的右子节点，重复上面的步骤，直到栈为空
## 算法复杂度
**时间复杂度**：O(n)
**空间复杂度**：O(n)