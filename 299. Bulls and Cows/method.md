## 问题 ##
[题目链接](https://leetcode-cn.com/problems/bulls-and-cows/description/)
## 思路 ##
1.确定公牛的数量，判断秘密数字和猜测数字对应的位置上数字是否相等。  
2.判断猜对的总数(公牛+母牛)  
(1).定义一个HashMap，将秘密数的每一位作为键放入map中，其值为每一位数字出现的次数。  
(2).把猜测数的每一位当作键，查找map中是否有此键。如果没有，此数猜错；如果有，则令其值减1。当值为零时，说明不会再有数字被猜对，那么就将此键删除。
## 算法复杂度 ##
**时间复杂度** O(n)  
步骤1.O(n)  
步骤2(1).O(n)  
步骤2(2).O(n)  
**空间复杂度** O(n)  
维护两个计数器 + 一个HashMap
