/**
 * 表单控制器
 */
Ext.define("app.controller.FormController",{
	extend:"Ext.app.Controller",
	initForm:function(){
		var self=this;
		var formCtr={
			"baseform":{
				render:function(form){
					var basePanel=form.up("basepanel");
					if(basePanel){
					var funCode=basePanel.funCode;
					form.funCode=funCode;
						}
					//form.itemId=funCode+"_baseform";
				}
			}
		}
		Ext.apply(self.ctr,formCtr);
	},
	views:[
		"app.view.form.BaseComboBox",
		"app.view.form.BaseQueryField",
		"app.view.form.BaseQueryLoad",
		 "app.view.form.ComboBoxTree"
	]
});