Ext.define("core.sys.icon.view.IconPanel",{
	extend:"core.app.base.BasePanel",
	alias:"widget.icon.iconlayout",
	funCode:"sysicon_main",
	funData:{
	        action:"coreIcon", //请求Action
	        whereSql:"",//表格查询条件
	        orderSql:"",//表格排序条件
	        pkName:"id",
	        uploadFields:"icon",
	        modelName:"org.yingqu.desktop.model.SysIcon",//实体全路径
	        tableName:"SysIcon",//表名
	        defaultObj:{pixel:"16*16"}//默认信息，用于表格添加的时候字段默认值
	},
	items:[{
		xtype:"icon.icongrid"
	},{
		xtype:"icon.iconform",
		hidden:true
	}]
});