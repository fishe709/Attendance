package cn.itkt.core.dao.common;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

import org.springframework.stereotype.Component;

import cn.itkt.core.dao.ITreeModel;

@Component
public class TreeModel implements ITreeModel<Long> {

	private Long nodeId;

	private Long nodePid;

	private String nodeName;

	private Long nodeOrder;

	private String nodeImage;

	private int nodeLevel;

	private String description;

	private Set<ITreeModel<Long>> children = new HashSet<ITreeModel<Long>>();

	private TreeModel parent;

	@Override
	public Long getNodeId() {
		return nodeId;
	}

	@Override
	public Long getNodePid() {
		return nodePid;
	}

	@Override
	public String getNodeName() {
		return nodeName;
	}

	@Override
	public Long getNodeOrder() {
		return nodeOrder;
	}

	@Override
	public String getNodeImage() {
		return nodeImage;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public boolean isLeaf() {
		return (getChildren() == null || getChildren().size() == 0);
	}

	@Override
	public boolean isRoot() {
		return (getParent() == null);
	}

	@Override
	public ITreeModel<Long> getParent() {
		return parent;
	}

	@Override
	public boolean isParentOf(ITreeModel<Long> treeModel) {
		if (treeModel == null || ((TreeModel) treeModel).equals(this)) {
			/* 如果对方为空 */
			return false;
		} else if (this.isLeaf()) {
			/* 如果自己为叶子,则返回FALSE */
			return false;
		} else if (treeModel.isRoot()) {
			/* 如果对方为根,返回FALSE */
			return false;
		} else {
			TreeModel bt = (TreeModel) (treeModel.getParent());
			if (this.equals(bt)) {
				/* 如果对方的父节点是自己,则返回TRUE */
				return true;
			} else {
				/* 判断对方的父节点是否是自己的孩子,进行递归 */
				return isParentOf(bt);
			}
		}
	}

	@Override
	public boolean isChildOf(ITreeModel<Long> treeModel) {
		return (treeModel.isParentOf(this));
	}

	@Override
	public void addChild(ITreeModel<Long> treeModel) {
		children.add(treeModel);
	}

	@Override
	public void rmChild(ITreeModel<Long> treeModel) {
		children.remove(treeModel);

	}

	@Override
	public Set<ITreeModel<Long>> getAllChildren() {
		Set<ITreeModel<Long>> set = new HashSet<ITreeModel<Long>>();
		Stack<ITreeModel<Long>> stack = new Stack<ITreeModel<Long>>();
		stack.push(this);
		while (!stack.empty()) {
			TreeModel bt = (TreeModel) stack.pop();
			set.add(bt);
			Iterator<ITreeModel<Long>> itr = bt.getChildren().iterator();
			while (itr.hasNext()) {
				TreeModel btchild = (TreeModel) itr.next();
				stack.push(btchild);
			}
		}
		set.remove(this);
		return set;
	}

	public List<ITreeModel<Long>> getMeAndListAllChildren() {
		List<ITreeModel<Long>> lst = new Vector<ITreeModel<Long>>();
		lst.add(this);
		Iterator<ITreeModel<Long>> itr = this.getChildren().iterator();
		while (itr.hasNext()) {
			TreeModel bt = (TreeModel) itr.next();
			lst.addAll(bt.getMeAndListAllChildren());
		}

		return lst;
	}

	@Override
	public Set<ITreeModel<Long>> getChildren() {
		return children;
	}

	@Override
	public Set<ITreeModel<Long>> getAllLeaves() {
		Set<ITreeModel<Long>> set_old = this.getAllChildren();
		Set<ITreeModel<Long>> set = new HashSet<ITreeModel<Long>>();
		set.addAll(set_old);
		Iterator<ITreeModel<Long>> itr = set_old.iterator();
		while (itr.hasNext()) {
			TreeModel bt = (TreeModel) itr.next();
			if (!bt.isLeaf()) {
				set.remove(bt);
			}
		}
		return set;
	}

	@Override
	public int getNodeLevel() {
		return nodeLevel;
	}

	public void setChildren(Set<ITreeModel<Long>> children) {
		this.children = children;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public void setNodePid(Long nodePid) {
		this.nodePid = nodePid;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public void setNodeOrder(Long nodeOrder) {
		this.nodeOrder = nodeOrder;
	}

	public void setNodeImage(String nodeImage) {
		this.nodeImage = nodeImage;
	}

	public void setNodeLevel(int nodeLevel) {
		this.nodeLevel = nodeLevel;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setParent(TreeModel parent) {
		this.parent = parent;
	}
}
