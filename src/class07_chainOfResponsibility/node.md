### 责任链模式(比较难)
1. 将两个过滤器的两个request通过链条先后执行
2. 直接将response的处理放在request的下面，这将会先执行第一个过滤器的request，然后执行第一个过滤器的response，在先后执行第二个过滤器的request和response
3. 在filterChain中处理加入位置的记录，同时在filter中加入第三个参数(类似递归行为)
4. 完全与Servlet中的FilterChain模式一样