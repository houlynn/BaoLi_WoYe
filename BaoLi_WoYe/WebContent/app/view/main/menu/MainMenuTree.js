/**
 * 树状菜单，显示在主界面的左边
 */
Ext.define('app.view.main.menu.MainMenuTree', {
			extend : 'Ext.tree.Panel',
			alias : 'widget.mainmenutree',
			title : '系统菜单',
			listeners: { itemclick:"menItemClick" },
			rootVisible : false,
			lines : false,
			initComponent : function() {
				var vm = this.up('app-main').getViewModel();
				var menuStore=vm.getSystemStore();
				console.log(menuStore);
				this.store=menuStore;
				this.callParent(arguments);
			}
		})