import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModuleEntity {

    @SerializedName("msg")
    private String msg;
    @SerializedName("code")
    private Integer code;
    @SerializedName("data")
    private List<DataDTO> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        @SerializedName("children")
        private List<ChildrenDTO> children;
        @SerializedName("chooseId")
        private Integer chooseId;
        @SerializedName("deptId")
        private String deptId;
        @SerializedName("id")
        private Integer id;
        @SerializedName("isDefault")
        private Integer isDefault;
        @SerializedName("name")
        private String name;
        @SerializedName("parentId")
        private Integer parentId;
        @SerializedName("sort")
        private Integer sort;
        @SerializedName("comments")
        private String comments;
        @SerializedName("icon")
        private String icon;
        @SerializedName("image")
        private String image;
        @SerializedName("resource")
        private String resource;
        @SerializedName("type")
        private String type;

        public List<ChildrenDTO> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenDTO> children) {
            this.children = children;
        }

        public Integer getChooseId() {
            return chooseId;
        }

        public void setChooseId(Integer chooseId) {
            this.chooseId = chooseId;
        }

        public String getDeptId() {
            return deptId;
        }

        public void setDeptId(String deptId) {
            this.deptId = deptId;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getIsDefault() {
            return isDefault;
        }

        public void setIsDefault(Integer isDefault) {
            this.isDefault = isDefault;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getParentId() {
            return parentId;
        }

        public void setParentId(Integer parentId) {
            this.parentId = parentId;
        }

        public Integer getSort() {
            return sort;
        }

        public void setSort(Integer sort) {
            this.sort = sort;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getResource() {
            return resource;
        }

        public void setResource(String resource) {
            this.resource = resource;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static class ChildrenDTO {
            @SerializedName("children")
            private List<?> children;
            @SerializedName("chooseId")
            private Integer chooseId;
            @SerializedName("comments")
            private String comments;
            @SerializedName("deptId")
            private String deptId;
            @SerializedName("icon")
            private String icon;
            @SerializedName("id")
            private Integer id;
            @SerializedName("image")
            private String image;
            @SerializedName("isDefault")
            private Integer isDefault;
            @SerializedName("name")
            private String name;
            @SerializedName("parentId")
            private Integer parentId;
            @SerializedName("resource")
            private String resource;
            @SerializedName("sort")
            private Integer sort;
            @SerializedName("type")
            private String type;

            public List<?> getChildren() {
                return children;
            }

            public void setChildren(List<?> children) {
                this.children = children;
            }

            public Integer getChooseId() {
                return chooseId;
            }

            public void setChooseId(Integer chooseId) {
                this.chooseId = chooseId;
            }

            public String getComments() {
                if (comments == null) {
                    return "";
                }
                return comments;
            }

            public void setComments(String comments) {
                this.comments = comments;
            }

            public String getDeptId() {
                return deptId;
            }

            public void setDeptId(String deptId) {
                this.deptId = deptId;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getImage() {
                if (image == null) {
                    return "";
                }
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public Integer getIsDefault() {
                return isDefault;
            }

            public void setIsDefault(Integer isDefault) {
                this.isDefault = isDefault;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getParentId() {
                return parentId;
            }

            public void setParentId(Integer parentId) {
                this.parentId = parentId;
            }

            public String getResource() {
                return resource;
            }

            public void setResource(String resource) {
                this.resource = resource;
            }

            public Integer getSort() {
                return sort;
            }

            public void setSort(Integer sort) {
                this.sort = sort;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
