## 问题 ##
设计一个 TinyURL 的加密 encode 和解密 decode 的方法。你的加密和解密算法如何设计和运作是没有限制的，你只需要保证一个URL可以被加密成一个TinyURL，并且
这个TinyURL可以用解密方法恢复成原本的URL
## 思路 ##
题目不要求将原URl加密到哪种程度，所以偷了个懒，将原翻转URL，作为加密。至于解密，自然是再次翻转URL
## 算法复杂度 ##
(encode==decode)  
**时间复杂度**&nbsp;O(n)  
利用双指针，头尾互换O(n/2)    
**空间复杂度**&nbsp;O(n)  
将字符串转换为字符数组
