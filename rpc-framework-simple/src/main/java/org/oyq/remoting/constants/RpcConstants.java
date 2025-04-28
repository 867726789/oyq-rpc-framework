package org.oyq.remoting.constants;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * RPC 协议常量定义类.
 * 包含协议魔数、编码格式、消息类型等全局常量.
 *

 */
public final class RpcConstants {

    /**
     * 协议魔数（4字节），用于快速识别协议有效性.
     * 值为字节数组 {'h', 'a', 'n', 'd'}.
     */
    public static final byte[] MAGIC_NUMBER = {(byte) 'h', (byte) 'a', (byte) 'n', (byte) 'd'};

    /**
     * 默认字符编码集（UTF-8）.
     */
    public static final Charset DEFAULT_CHARSET = StandardCharsets.UTF_8;

    /**
     * 协议版本号.
     */
    public static final byte VERSION = 1;

    /**
     * 消息总长度字段的字节数（固定16字节）.
     */
    public static final byte TOTAL_LENGTH = 16;

    /* 消息类型常量 */
    /** 普通请求消息类型. */
    public static final byte REQUEST_TYPE = 1;
    /** 响应消息类型. */
    public static final byte RESPONSE_TYPE = 2;
    /** 心跳请求类型. */
    public static final byte HEARTBEAT_REQUEST_TYPE = 3;
    /** 心跳响应类型. */
    public static final byte HEARTBEAT_RESPONSE_TYPE = 4;

    /**
     * 协议头长度（字节数）.
     */
    public static final int HEAD_LENGTH = 16;

    /* 心跳消息内容 */
    /** 心跳检测请求内容. */
    public static final String PING = "ping";
    /** 心跳检测响应内容. */
    public static final String PONG = "pong";

    /**
     * 最大帧长度（8MB），用于防止恶意超大包.
     */
    public static final int MAX_FRAME_LENGTH = 8 * 1024 * 1024;

    /**
     * 私有构造方法，禁止实例化.
     */
    private RpcConstants() {
        throw new UnsupportedOperationException("Constant class cannot be instantiated");
    }
}