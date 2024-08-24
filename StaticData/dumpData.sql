-- SQL Dump File for Makersharks Database

CREATE DATABASE makersharks;

USE makersharks;

CREATE TABLE supplier (
    supplier_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(255) NOT NULL,
    website VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL,
    nature_of_business ENUM('small_scale', 'medium_scale', 'large_scale') NOT NULL,
    manufacturing_processes ENUM('moulding', '3d_printing', 'casting', 'coating') NOT NULL
);

INSERT INTO supplier (company_name, website, location, nature_of_business, manufacturing_processes) VALUES
('Supplier A', 'http://supplier-a.com', 'India', 'small_scale', '3d_printing'),
('Supplier B', 'http://supplier-b.com', 'USA', 'medium_scale', 'moulding'),
('Supplier C', 'http://supplier-c.com', 'India', 'large_scale', 'casting'),
('Supplier D', 'http://supplier-d.com', 'China', 'small_scale', 'coating'),
('Supplier E', 'http://supplier-e.com', 'Germany', 'medium_scale', '3d_printing'),
('Supplier F', 'http://supplier-f.com', 'India', 'small_scale', 'casting'),
('Supplier G', 'http://supplier-g.com', 'India', 'medium_scale', 'coating'),
('Supplier H', 'http://supplier-h.com', 'USA', 'large_scale', 'moulding'),
('Supplier I', 'http://supplier-i.com', 'USA', 'small_scale', '3d_printing'),
('Supplier J', 'http://supplier-j.com', 'China', 'medium_scale', 'casting'),
('Supplier K', 'http://supplier-k.com', 'China', 'large_scale', 'coating'),
('Supplier L', 'http://supplier-l.com', 'Germany', 'small_scale', 'moulding'),
('Supplier M', 'http://supplier-m.com', 'India', 'medium_scale', '3d_printing'),
('Supplier N', 'http://supplier-n.com', 'USA', 'large_scale', 'casting'),
('Supplier O', 'http://supplier-o.com', 'India', 'small_scale', 'coating'),
('Supplier P', 'http://supplier-p.com', 'China', 'medium_scale', 'moulding'),
('Supplier Q', 'http://supplier-q.com', 'Germany', 'large_scale', '3d_printing'),
('Supplier R', 'http://supplier-r.com', 'India', 'small_scale', 'casting'),
('Supplier S', 'http://supplier-s.com', 'India', 'medium_scale', 'coating'),
('Supplier T', 'http://supplier-t.com', 'USA', 'large_scale', 'moulding');
