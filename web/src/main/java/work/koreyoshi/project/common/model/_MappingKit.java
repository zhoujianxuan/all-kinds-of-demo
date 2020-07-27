package work.koreyoshi.project.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("sys_account", "id", SysAccount.class);
		// Composite Primary Key order: account_id,role_id
		arp.addMapping("sys_account_role", "account_id,role_id", SysAccountRole.class);
		arp.addMapping("sys_permission", "id", SysPermission.class);
		arp.addMapping("sys_role", "id", SysRole.class);
		// Composite Primary Key order: permission_id,role_id
		arp.addMapping("sys_role_permission", "permission_id,role_id", SysRolePermission.class);
	}
}
