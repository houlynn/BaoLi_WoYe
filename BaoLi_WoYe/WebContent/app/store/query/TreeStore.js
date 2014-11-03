Ext.define("app.store.query.TreeStore",{
	extend:"Ext.data.TreeStore",
	defaultRootId:"ROOT",
	model:factory.ModelFactory.getModelByName("org.yingqu.framework.model.vo.JSONTreeNode","checked").modelName,
	constructor: function(config) {
		this.proxy=Ext.create("Ext.data.proxy.Ajax",{
			url:config.url,
			async : false, //同步的操作
			actionMethods:{
				 create : 'POST',
				 read   : 'POST',
				 update : 'POST',
			     destroy: 'POST'
			},
			extraParams :{},
			reader: 'json'
		});
	    this.callParent(arguments);
	}
})