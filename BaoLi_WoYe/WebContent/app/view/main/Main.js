Ext.define('app.view.main.Main', {
			extend : 'Ext.container.Container',
			xtype : 'app-main',
			requires:['app.view.main.MainModel','app.view.main.MainController'],
			uses : ['app.view.main.region.Center', 'app.view.main.region.Top',
					'app.view.main.region.Bottom','app.view.main.region.Left'
					 ],
		controller : 'main',
						// MVVM架构的控制器的名称，会在当前路径中根据‘Main’ + Controller 来确定文件名
						// 这个我没找到其他任何可以自动加载MainController.js的依据，只能作上面的判断了
		viewModel : {
					type : 'main'
							// MVVM架构的viewModel的类型，会在当前路径中根据‘Main’ + Model 来确定文件名
		},
			initComponent : function() {
				Ext.setGlyphFontFamily('FontAwesome'); // 设置图标字体文件，只有设置了以后才能用glyph属性
				
				// 在此处取得各个modelView的参数，通过ajax也行
				
				//this.getViewModel().set('monetary.value','tenthousand');

				
				this.callParent();
			},
			layout : {
				type : 'border' // 系统的主页面的布局
			},

			listeners : {
				resize : function(container) {
					//container.getController().onMainResize();
				}
			},
				items : [{
				xtype : 'maintop',
				region : 'north' // 把他放在最顶上
			}, {
				xtype : 'mainbottom',
				region : 'south' // 把他放在最底下
			}, {
				xtype : 'mainmenuregion',
				region : 'west', // 左边面板
				title : '导航菜单',
				// hidden : Cookies.get('menutoolbar', 'true') == 'true',
				width : 220,
				collapsible : true,
				split : true,
			}, {
				region : 'center', // 中间面版
				xtype : 'maincenter'
			}]
});

			
