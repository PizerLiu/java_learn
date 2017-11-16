
1:首先安装rabbitMQ并启动

2:Produce.java为生产者程序

3:Customer.java为消费者程序

当有多个Customer消费者程序时，可以起到负载均衡的作用，也可以根据不用队列名去处理不同的事件（rabbitMQ自带有过滤功能）
