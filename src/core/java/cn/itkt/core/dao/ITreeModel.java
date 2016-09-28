package cn.itkt.core.dao;

import java.io.Serializable;
import java.util.Set;

public interface ITreeModel<PK extends Serializable> {

	/**
	 * 获取节点ID
	 * @return
	 */
	PK getNodeId();

	/**
	 * 获取节点父节点ID
	 * @return
	 */
	PK getNodePid();

	/**
	 * 获取节点名称
	 * @return
	 */
	String getNodeName();

	/**
	 * 获取节点排列号
	 * @return
	 */
	PK getNodeOrder();

	/**
	 * 获取节点的图片信息
	 * @return
	 */
	String getNodeImage();

	/**
	 * 获取节点的描述信息
	 * @return
	 */
	String getDescription();

	/**
	 * 是否为叶子
	 * @return
	 */
	boolean isLeaf();

	/**
	 * 是否是根节点
	 * @return
	 */
	boolean isRoot();

	/**
	 * 获取节点的父节点
	 * @return
	 */
	ITreeModel<PK> getParent();

	/**
	 * 判断节点是否是父节点
	 * @param treeModel 节点
	 * @return
	 */
	boolean isParentOf(ITreeModel<PK> treeModel);

	/**
	 * 判断节点是否是子节点
	 * @param treeModel 节点
	 * @return
	 */
	boolean isChildOf(ITreeModel<PK> treeModel);

	/**
	 * 添加子节点
	 * @param treeModel 节点
	 */
	void addChild(ITreeModel<PK> treeModel);

	/**
	 * 移除子节点
	 * @param treeModel
	 */
	void rmChild(ITreeModel<PK> treeModel);

	/**
	 * 获得所有的子节点
	 * @return
	 */
	Set<ITreeModel<PK>> getAllChildren();

	/**
	 * 获得所有的直属子节点
	 * @return
	 */
	Set<ITreeModel<PK>> getChildren();

	/**
	 * 获取所有的叶子节点
	 * @return
	 */
	Set<ITreeModel<PK>> getAllLeaves();

	/**
	 * 获得节点的层数
	 * @return
	 */
	int getNodeLevel();
}