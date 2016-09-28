package cn.itkt.hotel.local.dto.web;

import java.io.Serializable;

/**
  * ============================================================================
  * @ClassName: WxAlbumMessageDto
  * @Description: TODO(微信企业号电子相册)
  * @author lihui
  * @date 2016-3-31 下午3:49:25
  * ============================================================================
 */
public class WxAlbumMessageDto implements Serializable{
	
	private String schoolIdentify;
	private Integer picSize;			//上传照片总数
	private Integer sendId;			//发送者id(老师名称)
	private String sendName;			//发送者名称(老师名称)
	private Integer specialid;			//相册
	private Integer clazzid;            //班级id
	
	
	public String getSchoolIdentify() {
		return schoolIdentify;
	}
	public void setSchoolIdentify(String schoolIdentify) {
		this.schoolIdentify = schoolIdentify;
	}
	public Integer getPicSize() {
		return picSize;
	}
	public void setPicSize(Integer picSize) {
		this.picSize = picSize;
	}
	public String getSendName() {
		return sendName;
	}
	public void setSendName(String sendName) {
		this.sendName = sendName;
	}
	public Integer getSendId() {
		return sendId;
	}
	public void setSendId(Integer sendId) {
		this.sendId = sendId;
	}
	public Integer getSpecialid() {
		return specialid;
	}
	public void setSpecialid(Integer specialid) {
		this.specialid = specialid;
	}
	public Integer getClazzid() {
		return clazzid;
	}
	public void setClazzid(Integer clazzid) {
		this.clazzid = clazzid;
	}
	public WxAlbumMessageDto(String schoolIdentify, Integer picSize, String sendName, Integer sendId, Integer specialid, Integer clazzid) {
		super();
		this.schoolIdentify = schoolIdentify;
		this.picSize = picSize;
		this.sendName = sendName;
		this.sendId = sendId;
		this.specialid = specialid;
		this.clazzid = clazzid;
	}
	public WxAlbumMessageDto() {
		super();
	}
	
	
}