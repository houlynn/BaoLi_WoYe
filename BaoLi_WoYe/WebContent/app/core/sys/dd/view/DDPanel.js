Ext.define("core.sys.dd.view.DDPanel",{
	extend:"core.app.base.BasePanel",
	alias:"widget.dd.ddlayout",
	funCode:"dictionary_main",
	funData:{
	        action:"/coreDDe", //请求Action
	        whereSql:"",//表格查询条件
	        orderSql:"",//表格排序条件
	        pkName:"ddId",
	        uploadFields:"",
	        isChildren:false,//是否子功能
	        modelName:"org.yingqu.desktop.model.Dictionary",//实体全路径
	        tableName:"Dictionary",//表名
	        defaultObj:{enabled:"1",ddType:"LIST"},//默认信息，用于表格添加的时候字段默认值
	        children:[{//子功能的配置
	        	funCode:"dictionaryitem_main"	        	
	        }]
	},
	items:[{
		xtype:"basecenterpanel",
		items:[{
			xtype:"basequerypanel",
			region:"north",
			items:[{
				xtype:"basequeryfield",
				queryType:"textfield",
				fieldLabel:"字典名称",
				name:"ddName"
			},{
				xtype:"basequeryfield",
				queryType:"basecombobox",
				fieldLabel:"是否启用",
				name:"enabled",
				config:{
					ddCode:"ENABLED"
				}
			},{
				xtype:"basequeryfield",
				queryType:"datetimefield",
				fieldLabel:"创建时间",
				name:"createTime",
				config:{
					dateType : 'datetime'				
				}
			},{
				xtype:"basequeryfield",
				queryType:"numberfield",
				fieldLabel:"排序查询",
				name:"orderIndex"
			}]
		},{
			xtype:"dd.ddgrid",
			region:"center"
		}]
	},{
		xtype:"dd.ddform",
		hidden:true
	}]
});