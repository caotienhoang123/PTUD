USE [master]
GO
/****** Object:  Database [QuanLiLuongSanPham2]    Script Date: 10/18/2022 3:33:18 PM ******/
CREATE DATABASE [QuanLiLuongSanPham2]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLiLuongSanPham2', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\QuanLiLuongSanPham2.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QuanLiLuongSanPham2_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\QuanLiLuongSanPham2_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLiLuongSanPham2].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET  ENABLE_BROKER 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET RECOVERY FULL 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'QuanLiLuongSanPham2', N'ON'
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET QUERY_STORE = OFF
GO
USE [QuanLiLuongSanPham2]
GO
/****** Object:  Table [dbo].[CaLamCongNhan]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CaLamCongNhan](
	[maCa] [varchar](30) NOT NULL,
	[tenCa] [nvarchar](10) NULL,
	[gioLam] [nvarchar](30) NULL,
	[tienLuong] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[maCa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CaLamHanhChinh]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CaLamHanhChinh](
	[maCaLam] [varchar](20) NOT NULL,
	[tenCaLam] [nvarchar](20) NULL,
	[gioLam] [nvarchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[maCaLam] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChamCongCongNhan]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChamCongCongNhan](
	[maChamCong] [varchar](50) NOT NULL,
	[maCongNhan] [varchar](30) NULL,
	[tenCongNhan] [nvarchar](30) NULL,
	[maPhanCong] [varchar](50) NULL,
	[maCongDoan] [varchar](30) NULL,
	[tenCongDoan] [nvarchar](30) NULL,
	[maCa] [varchar](30) NULL,
	[tenCa] [nvarchar](20) NULL,
	[gioLam] [nvarchar](20) NULL,
	[soSanPham] [int] NULL,
	[ngayCham] [date] NULL,
	[trangThai] [nvarchar](20) NULL,
	[nghiPhep] [nvarchar](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[maChamCong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChamCongNhanVienHanhChinh]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChamCongNhanVienHanhChinh](
	[maCong] [varchar](50) NOT NULL,
	[caLam] [varchar](20) NULL,
	[ngayCham] [date] NULL,
	[maNV] [varchar](50) NULL,
	[tenNV] [nvarchar](50) NULL,
	[trangThai] [nvarchar](30) NULL,
	[nghiPhep] [nvarchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[maCong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[maChucVu] [varchar](30) NOT NULL,
	[tenChucVu] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[maChucVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CongDoan]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CongDoan](
	[maCongDoan] [varchar](30) NOT NULL,
	[sanPham] [varchar](30) NULL,
	[tenCongDoan] [nvarchar](30) NULL,
	[giaCongDoan] [money] NULL,
	[soLuong] [int] NULL,
	[congDoanTruoc] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[maCongDoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CongNhan]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CongNhan](
	[maCongNhan] [varchar](30) NOT NULL,
	[hoTen] [nvarchar](30) NULL,
	[cmnd] [varchar](30) NULL,
	[gioiTinh] [nvarchar](10) NULL,
	[ngaySinh] [date] NULL,
	[sdt] [varchar](15) NULL,
	[diaChi] [nvarchar](30) NULL,
	[phuCap] [varchar](30) NULL,
	[phongBan] [varchar](30) NULL,
	[tinhTrang] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[maCongNhan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HeSoLuong]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HeSoLuong](
	[maHSL] [varchar](20) NOT NULL,
	[hesoLuong] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[maHSL] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVienHanhChinh]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVienHanhChinh](
	[maNVHC] [varchar](50) NOT NULL,
	[hoTen] [nvarchar](50) NULL,
	[cmnd] [varchar](50) NULL,
	[ngaySinh] [date] NULL,
	[gioiTinh] [nvarchar](10) NULL,
	[luongCoBan] [money] NULL,
	[sdt] [varchar](50) NULL,
	[diaChi] [nvarchar](50) NULL,
	[chucVu] [varchar](30) NULL,
	[maHSL] [varchar](20) NULL,
	[phuCap] [varchar](30) NULL,
	[phongBan] [varchar](30) NULL,
	[trangThai] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[maNVHC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhanCong]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhanCong](
	[maPC] [varchar](50) NOT NULL,
	[maCongNhan] [varchar](30) NULL,
	[maCongDoan] [varchar](30) NULL,
	[soLuongCan] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maPC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhongBan]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhongBan](
	[maPB] [varchar](30) NOT NULL,
	[tenPB] [nvarchar](50) NULL,
	[diaChi] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[maPB] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhuCapNhanVien]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhuCapNhanVien](
	[maPC] [varchar](30) NOT NULL,
	[loaiPhuCap] [nvarchar](50) NULL,
	[tienPhuCap] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[maPC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[maSP] [varchar](30) NOT NULL,
	[tenSP] [nvarchar](30) NULL,
	[kieuDang] [nvarchar](30) NULL,
	[chatLieu] [nvarchar](30) NULL,
	[soLuong] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[maSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[maTaiKhoan] [varchar](50) NOT NULL,
	[loaiTK] [nvarchar](30) NULL,
	[tinhTrang] [nvarchar](30) NULL,
	[matKhau] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[maTaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TinhLuongCongNhan]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TinhLuongCongNhan](
	[maLuong] [int] IDENTITY(1,1) NOT NULL,
	[maCN] [varchar](30) NULL,
	[tenNV] [nvarchar](50) NULL,
	[cmnd] [nvarchar](30) NULL,
	[ngaySinh] [date] NULL,
	[gioiTinh] [nvarchar](7) NULL,
	[phongBan] [nvarchar](30) NULL,
	[phuCap] [money] NULL,
	[thang] [int] NULL,
	[nam] [int] NULL,
	[luong] [money] NULL,
	[maPC] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[maLuong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TinhLuongNhanVienHanhChinh]    Script Date: 10/18/2022 3:33:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TinhLuongNhanVienHanhChinh](
	[maLuong] [int] IDENTITY(1,1) NOT NULL,
	[maNV] [varchar](50) NULL,
	[tenNV] [nvarchar](50) NULL,
	[cmnd] [nvarchar](30) NULL,
	[luongCB] [money] NULL,
	[hsLuong] [float] NULL,
	[phuCap] [money] NULL,
	[thang] [int] NULL,
	[nam] [int] NULL,
	[luong] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[maLuong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[ChamCongCongNhan]  WITH CHECK ADD  CONSTRAINT [FK_ChamCong_CongNhan] FOREIGN KEY([maCongNhan])
REFERENCES [dbo].[CongNhan] ([maCongNhan])
GO
ALTER TABLE [dbo].[ChamCongCongNhan] CHECK CONSTRAINT [FK_ChamCong_CongNhan]
GO
ALTER TABLE [dbo].[ChamCongCongNhan]  WITH CHECK ADD  CONSTRAINT [FK_ChamCongCongNhan_CaLamCongNhan] FOREIGN KEY([maCa])
REFERENCES [dbo].[CaLamCongNhan] ([maCa])
GO
ALTER TABLE [dbo].[ChamCongCongNhan] CHECK CONSTRAINT [FK_ChamCongCongNhan_CaLamCongNhan]
GO
ALTER TABLE [dbo].[ChamCongCongNhan]  WITH CHECK ADD  CONSTRAINT [FK_ChamCongCongNhan_CongDoan] FOREIGN KEY([maCongDoan])
REFERENCES [dbo].[CongDoan] ([maCongDoan])
GO
ALTER TABLE [dbo].[ChamCongCongNhan] CHECK CONSTRAINT [FK_ChamCongCongNhan_CongDoan]
GO
ALTER TABLE [dbo].[ChamCongCongNhan]  WITH CHECK ADD  CONSTRAINT [FK_ChamCongCongNhan_PhanCong] FOREIGN KEY([maPhanCong])
REFERENCES [dbo].[PhanCong] ([maPC])
GO
ALTER TABLE [dbo].[ChamCongCongNhan] CHECK CONSTRAINT [FK_ChamCongCongNhan_PhanCong]
GO
ALTER TABLE [dbo].[ChamCongNhanVienHanhChinh]  WITH CHECK ADD  CONSTRAINT [FK_ChamCongNVHC_CaLam] FOREIGN KEY([caLam])
REFERENCES [dbo].[CaLamHanhChinh] ([maCaLam])
GO
ALTER TABLE [dbo].[ChamCongNhanVienHanhChinh] CHECK CONSTRAINT [FK_ChamCongNVHC_CaLam]
GO
ALTER TABLE [dbo].[ChamCongNhanVienHanhChinh]  WITH CHECK ADD  CONSTRAINT [FK_ChamCongNVHC_NV] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVienHanhChinh] ([maNVHC])
GO
ALTER TABLE [dbo].[ChamCongNhanVienHanhChinh] CHECK CONSTRAINT [FK_ChamCongNVHC_NV]
GO
ALTER TABLE [dbo].[CongDoan]  WITH CHECK ADD  CONSTRAINT [FK_CongDoan_SP] FOREIGN KEY([sanPham])
REFERENCES [dbo].[SanPham] ([maSP])
GO
ALTER TABLE [dbo].[CongDoan] CHECK CONSTRAINT [FK_CongDoan_SP]
GO
ALTER TABLE [dbo].[CongNhan]  WITH CHECK ADD  CONSTRAINT [FK_CongNhan_PB] FOREIGN KEY([phongBan])
REFERENCES [dbo].[PhongBan] ([maPB])
GO
ALTER TABLE [dbo].[CongNhan] CHECK CONSTRAINT [FK_CongNhan_PB]
GO
ALTER TABLE [dbo].[CongNhan]  WITH CHECK ADD  CONSTRAINT [FK_CongNhan_PC] FOREIGN KEY([phuCap])
REFERENCES [dbo].[PhuCapNhanVien] ([maPC])
GO
ALTER TABLE [dbo].[CongNhan] CHECK CONSTRAINT [FK_CongNhan_PC]
GO
ALTER TABLE [dbo].[NhanVienHanhChinh]  WITH CHECK ADD  CONSTRAINT [FK_NVHC_CV] FOREIGN KEY([chucVu])
REFERENCES [dbo].[ChucVu] ([maChucVu])
GO
ALTER TABLE [dbo].[NhanVienHanhChinh] CHECK CONSTRAINT [FK_NVHC_CV]
GO
ALTER TABLE [dbo].[NhanVienHanhChinh]  WITH CHECK ADD  CONSTRAINT [FK_NVHC_HSL] FOREIGN KEY([maHSL])
REFERENCES [dbo].[HeSoLuong] ([maHSL])
GO
ALTER TABLE [dbo].[NhanVienHanhChinh] CHECK CONSTRAINT [FK_NVHC_HSL]
GO
ALTER TABLE [dbo].[NhanVienHanhChinh]  WITH CHECK ADD  CONSTRAINT [FK_NVHC_PB] FOREIGN KEY([phongBan])
REFERENCES [dbo].[PhongBan] ([maPB])
GO
ALTER TABLE [dbo].[NhanVienHanhChinh] CHECK CONSTRAINT [FK_NVHC_PB]
GO
ALTER TABLE [dbo].[NhanVienHanhChinh]  WITH CHECK ADD  CONSTRAINT [FK_NVHC_PC] FOREIGN KEY([phuCap])
REFERENCES [dbo].[PhuCapNhanVien] ([maPC])
GO
ALTER TABLE [dbo].[NhanVienHanhChinh] CHECK CONSTRAINT [FK_NVHC_PC]
GO
ALTER TABLE [dbo].[PhanCong]  WITH CHECK ADD  CONSTRAINT [FK_PhanCong_CongDoan] FOREIGN KEY([maCongDoan])
REFERENCES [dbo].[CongDoan] ([maCongDoan])
GO
ALTER TABLE [dbo].[PhanCong] CHECK CONSTRAINT [FK_PhanCong_CongDoan]
GO
ALTER TABLE [dbo].[PhanCong]  WITH CHECK ADD  CONSTRAINT [FK_PhanCong_CongNhan] FOREIGN KEY([maCongNhan])
REFERENCES [dbo].[CongNhan] ([maCongNhan])
GO
ALTER TABLE [dbo].[PhanCong] CHECK CONSTRAINT [FK_PhanCong_CongNhan]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoan_NVHC] FOREIGN KEY([maTaiKhoan])
REFERENCES [dbo].[NhanVienHanhChinh] ([maNVHC])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FK_TaiKhoan_NVHC]
GO
ALTER TABLE [dbo].[TinhLuongCongNhan]  WITH CHECK ADD  CONSTRAINT [FK_TinhLuongCongNhan_PhanCong] FOREIGN KEY([maPC])
REFERENCES [dbo].[PhanCong] ([maPC])
GO
ALTER TABLE [dbo].[TinhLuongCongNhan] CHECK CONSTRAINT [FK_TinhLuongCongNhan_PhanCong]
GO
ALTER TABLE [dbo].[TinhLuongCongNhan]  WITH CHECK ADD  CONSTRAINT [TinhLuongCN_CN] FOREIGN KEY([maCN])
REFERENCES [dbo].[CongNhan] ([maCongNhan])
GO
ALTER TABLE [dbo].[TinhLuongCongNhan] CHECK CONSTRAINT [TinhLuongCN_CN]
GO
ALTER TABLE [dbo].[TinhLuongNhanVienHanhChinh]  WITH CHECK ADD  CONSTRAINT [TinhLuongHC_NV] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVienHanhChinh] ([maNVHC])
GO
ALTER TABLE [dbo].[TinhLuongNhanVienHanhChinh] CHECK CONSTRAINT [TinhLuongHC_NV]
GO
USE [master]
GO
ALTER DATABASE [QuanLiLuongSanPham2] SET  READ_WRITE 
GO
