package com.javasj.service;

import java.util.List;

import com.javasj.entity.Message;
import com.javasj.util.Page;

/**
* 
* @ClassName: MessageService 
* @Description: TODO(消息管理接口) 
* @author 王小圈 
* @date 2015年10月27日 上午11:20:00 
*
*/
public interface MessageService {
	/**
	* @Title: addMessage 
	* @Description: TODO(添加一条消息) 
	* @param @param message  消息对象
	* @return int    返回类型 
	* @throws
	*/
	public int addMessage(Message message);
	/**
	* @Title: updateMessage 
	* @Description: TODO(更新一条消息) 
	* @param @param message 消息对象
	* @return int    返回类型 
	* @throws
	*/
	public int updateMessage(Message message);
	/**
	* @Title: deleteMessage 
	* @Description: TODO(删除一条消息) 
	* @param @param messageId    消息编号
	* @return int    返回类型 
	* @throws
	*/
	public int deleteMessage(int messageId);
	/**
	* @Title: findMessageById 
	* @Description: TODO(根据消息编号来加载一个消息) 
	* @param @param messageId 消息编号
	* @param @return   返回消息信息
	* @return Message    返回类型 
	* @throws
	*/
	public Message findMessageById(int messageId);
	/**
	* @Title: findAllMessage 
	* @Description: TODO(带分页查找消息列表) 
	* @param @param page 分页对象
	* @param @return 消息列表
	* @return List<Message>    返回类型 
	* @throws
	*/
	public List<Message> findAllMessage(Page page);
	/**
	* @Title: findAllMessageByMessageInfo 
	* @Description: TODO(根据消息信息带分页来查找消息列表) 
	* @param @param page  分页对象
	* @param @param message Message语句
	* @param @return  消息列表
	* @return List<Message>    返回类型 
	* @throws
	*/
	public List<Message> findAllMessageByMessageInfo(Page page,Message message);
	/**
	* @Title: findAllCount 
	* @Description: TODO(查询消息总数) 
	* @param @return 消息总数
	* @return int    返回类型 
	* @throws
	 */
	public int findAllCount();
	/**
	* @Title: findAllCountByMessageInfo 
	* @Description: TODO(带条件查询消息总数) 
	* @param @param message Message语句
	* @param @return 消息总数
	* @return int    返回类型 
	* @throws
	 */
	public int findAllCountByMessageInfo(Message message);
}
