package info.xiaomo.gameCore.network;

import io.netty.channel.ChannelHandlerContext;

/**
 * 网络事件监听器
 *
 * @author 小莫
 */
public interface INetworkEventListener {

    /**
     * 连接建立
     */
    void onConnected(ChannelHandlerContext ctx);

    /**
     * 连接断开
     */
    void onDisconnected(ChannelHandlerContext ctx);

    /**
     * 异常发生
     */
    void onExceptionOccur(ChannelHandlerContext ctx, Throwable cause);

}
