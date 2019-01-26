export class UserRole {
    functionlName: String;
    userRoles: {
        ADMIN: boolean;
        VIEWER: boolean;
    };

    constructor(functionlname:String, admin : boolean, viewer: boolean) {
        this.functionlName = functionlname;
         this.userRoles = {
             ADMIN: admin, VIEWER: viewer
         };
    }
}

