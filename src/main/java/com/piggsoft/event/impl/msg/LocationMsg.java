package com.piggsoft.event.impl.msg;

import com.piggsoft.event.WXEvent;
import com.piggsoft.event.annotation.XmlMsgType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author piggsoft@163.com
 * Created by user on 2015/11/19.
 * 地理位置消息
 */
@XmlMsgType(msgType = "location")
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class LocationMsg extends WXEvent {
}
