package com.sun.netty.client;

import com.sun.netty.handler.ClientHandler;
import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import org.jboss.netty.handler.codec.string.StringDecoder;
import org.jboss.netty.handler.codec.string.StringEncoder;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

/**
 * Created by SDL on 2015/5/5.
 */
public class NettyClient {

    private int port = 8080;
    private String host = "127.0.0.1";
    private ClientBootstrap bootstrap;
    private ClientHandler handler;
    private ChannelFuture channelFuture;

    /**
     * 初始化客户端
     */
    public void init() {
        bootstrap = new ClientBootstrap(new NioClientSocketChannelFactory(
                Executors.newCachedThreadPool(),
                Executors.newCachedThreadPool()));
        bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
            public ChannelPipeline getPipeline() throws Exception {
                ChannelPipeline pipeline = Channels.pipeline();
                pipeline.addLast("encode", new StringEncoder());
                pipeline.addLast("decode", new StringDecoder());
                pipeline.addLast("handler", handler);
                /*传输对象
                channelPipeline.addLast("encode", new ObjectDecoder(
                                ClassResolvers.cacheDisabled(
                                        this.getClass().getClassLoader()
                                )
                        )
                );
                channelPipeline.addLast("decode", new ObjectDecoder(
                                ClassResolvers.cacheDisabled(
                                        this.getClass().getClassLoader()
                                )
                        )
                );
               */
                return pipeline;
            }
        });
        bootstrap.setOption("tcpNoDelay", true);
        bootstrap.setOption("keepAlive", true);
        bootstrap.setOption("reuseAddress", true);
    }

    public void start() {
        channelFuture = bootstrap.connect(new InetSocketAddress(host, port));
        System.out.println("连接远程服务器" + host + ":" + port + "端口成功，你现在可以开始发消息了。");

    }

    public void stop() {
        channelFuture.awaitUninterruptibly();
        if (!channelFuture.isSuccess()) {
            channelFuture.getCause().printStackTrace();
        }
        //等待或者监听数据全部完成
        channelFuture.getChannel().getCloseFuture().awaitUninterruptibly();
        //释放连接资源
        bootstrap.releaseExternalResources();
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ClientBootstrap getBootstrap() {
        return bootstrap;
    }

    public void setBootstrap(ClientBootstrap bootstrap) {
        this.bootstrap = bootstrap;
    }

    public ClientHandler getHandler() {
        return handler;
    }

    public void setHandler(ClientHandler handler) {
        this.handler = handler;
    }

    public ChannelFuture getChannelFuture() {
        return channelFuture;
    }

    public void setChannelFuture(ChannelFuture channelFuture) {
        this.channelFuture = channelFuture;
    }
}
